# Programmers: Colten, Victoria
# Course:  CS151, Dr. Isaacman
# Due Date: 12/9/25
# Lab Assignment: PA 5
# Problem Statement: Analyze restaurant data
# Data In: file name of restaurant data
# Data Out: average rating per cuisine, filtered restaurants based on min rating and price range written to a new file, graph of restaurant price distribution, most popular cuisine type
# Credits: N/A
# Input Files: restaurants.csv
import os
import matplotlib.pyplot as plt
NAME = 0
RATING = 3
COST_FOR_TWO = 7
CUISINE_TYPE = 10


# Leader: both, driver: Colten
# Function name: get_filename
# Purpose: Get a file_name that exists from the user
# Parameters: None
# Return: file_name as a string
def get_filename():
    # get filename from user
    filename = input("Enter the filename of restaurant data: ").strip().lower()

    # error check filename
    while not os.path.exists(filename):
        print("File does not exist")
        filename = input("Enter the filename of restaurant data: ").strip().lower()

    return filename


# Leader: both, driver: Colten
# Function name: get_restaurant_data
# Purpose: puts the data from the user inputted file into a list of lists
# Parameters: file_name, the user inputted file name
# Return: list of lists containing restaurant data
def get_restaurant_data(filename):
    # initialize and open file
    restaurants = []
    file = open(filename, "r")

    # read each line and split data
    for line in file:
        parts = line.split(",")
        restaurant_data = []

        # clean spaces on each item
        for item in parts:
            restaurant_data.append(item.strip())

        # append list to the list of restaurants
        restaurants.append(restaurant_data)

    file.close()
    return restaurants


# Leader: Victoria
# Function name: get_average_rating
# Purpose: Obtain the average rating for each cuisine type
# Parameters: List of lists that contains restaurant data
# Return: Dictionary of each cuisine type and rating
def get_average_rating(restaurants):
    cuisine_ratings = {}
    cuisine_counts = {}
    for restaurant in restaurants:
        rating = float(restaurant[RATING])
        # separates cuisine types
        cuisines = restaurant[CUISINE_TYPE].split("/")
        for cuisine in cuisines:
            cuisine = cuisine.strip()
            # adds ratings to the total
            if cuisine in cuisine_counts:
                cuisine_ratings[cuisine] += rating
                cuisine_counts[cuisine] += 1
            else:
                cuisine_ratings[cuisine] = rating
                cuisine_counts[cuisine] = 1

    # creates dictionary containing averages
    average_ratings = {}
    for cuisine in cuisine_ratings:
        average_ratings[cuisine] = cuisine_ratings[cuisine] / cuisine_counts[cuisine]

    return average_ratings


# Leader: Colten
# Function name: get_filtered_restaurants
# Purpose: gets the list of restaurants filtered by min rating and price range
# Parameters: list of lists containing restaurant data, min rating, min price, max price
# Return: list of lists of filtered restaurants
def get_filtered_restaurants(min_rating, min_price, max_price, data):
    filtered_restaurants = []

    # finds restaurants within filters
    for restaurant in data:
        if float(restaurant[RATING]) >= min_rating and min_price <= int(restaurant[COST_FOR_TWO]) <= max_price:
            # appends selected restaurants
            filtered_restaurants.append(restaurant)

    # returns list of lists
    return filtered_restaurants


# Leader: Victoria
# Function name: write_to_file
# Purpose: write restaurant name, cuisine type, rating, and approximate cost to a file
# Parameters: list of lists of the restaurants we want to write and the new file name
# Return: None
def write_to_file(filtered_restaurants):
    # gets name for new file
    new_file_name = input("Enter a name for the new file: ").strip().lower()
    new_file = open(new_file_name, "w")
    # writes the filtered restaurants to the new file
    for restaurant in filtered_restaurants:
        new_file.write(
            f"Name: {restaurant[NAME]}, Cuisine type: {restaurant[CUISINE_TYPE]}, Rating: {restaurant[RATING]}, Cost for two: {restaurant[COST_FOR_TWO]}" + "\n")
    new_file.close()


# Leader: Colten
# Function name: get_most_popular_cuisine_type
# Purpose: finds the most popular cuisine type
# Parameters: list of lists containing restaurant data
# Return: the most popular cuisine type
def get_most_popular_cuisine_type(restaurants):
    cuisine_types = {}

    # loops through each restaurant in list and gets cuisine types
    for restaurant in restaurants:
        cuisines = restaurant[CUISINE_TYPE].split("/")

        # loops through each cuisine type
        for cuisine in cuisines:
            cuisine = cuisine.strip()

            # increment by 1 if cuisine type exists
            if cuisine in cuisine_types:
                cuisine_types[cuisine] += 1

            # adds the new cuisine type
            else:
                cuisine_types[cuisine] = 1

    return cuisine_types


# Leader: Victoria
# Function name: get_price_for_two
# Purpose: get the restaurant prices for two to display in graph
# Parameters: list of lists containing restaurant data
# Return: list of prices
def get_price_for_two(restaurants):
    restaurant_prices = []
    # loops through each restaurant row and appends each cost for two
    for restaurant in restaurants:
        restaurant_prices.append(float(restaurant[COST_FOR_TWO]))

    return restaurant_prices


# Leader: Colten
# Function name: display_graph
# Purpose: Display a graph to the user of the distribution of restaurants across different price ranges of the price for two
# Parameters: Data set as a list
# Return: None
def display_graph(restaurant_prices):
    # initialize variables
    x = []
    y = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    interval = float(max(restaurant_prices)) / 10

    # adds 10 intervals for the x-axis
    for i in range(10):
        x.append(str(round(interval * i)) + " - " + str(round(interval * (i + 1))))

    # finds the number of restaurants for the y-axis
    for price in restaurant_prices:
        for i in range(10):
            if round(interval * i) <= price < round(interval * (i + 1)):
                y[i] += 1

    # add labels and title to graph
    plt.bar(x, y)
    plt.xlabel('Prices in Rupees')
    plt.xticks(rotation=45, ha='right', fontsize=6)
    plt.subplots_adjust(bottom=0.18)
    plt.ylabel('Number of restaurants')
    plt.title('Price Distribution of Restaurant Prices in India')
    plt.show()


# Leader: Victoria
# Function name: display_menu
# Purpose: add HCI for the user to use the program with error checking
# Parameters: None
# Return: None
def display_menu():
    print()
    print("----------------Menu:----------------")
    print("1. Find Average Ratings per Cuisine Type")
    print("2. Filter Restaurants by Min Rating and Price Range")
    print("3. Display Graph of Distribution of Restaurants Across Different Price Ranges")
    print("4. Find Most Popular Cuisine Type")
    print("5. Input New Restaurant Data")
    print("6. Exit")
    print("-------------------------------------")
    print()
    choice = input("What would you like to do? ").strip()

    # error check user input
    while choice not in ["1", "2", "3", "4", "5", "6"]:
        print("Invalid choice. Please try again.")
        choice = input("What would you like to do? ").strip()
    return choice


# Leader: Colten
# Function name: get_valid_int
# Purpose: get an integer from the user with specifications
# Parameters: prompt as a string, error message as a string, min_value as a float/int, max_value as a float/int
# Return: user response
def get_valid_int(prompt, error, min_value, max_value=0):
    user_in = input(prompt + " ").strip()

    # if no max value
    if max_value == 0:
        # error checks input for number greater than min value
        while not (user_in.isdigit() and float(user_in) >= min_value):
            print(error)
            user_in = input(prompt + " ").strip()

    # if max value stated
    else:
        # error checks input for number between max value and min value
        while not (user_in.isdigit() and max_value >= float(user_in) >= min_value):
            print(error)
            user_in = input(prompt + " ").strip()

    return float(user_in)


# Leader: both
# Function name: main
# Purpose: runs program
# Parameters: None
# Return: None
def main():
    # greet the user
    print("Welcome to the restaurant listing!\n")

    # get restaurant data from user
    restaurants = get_restaurant_data(get_filename())

    choice = "0"

    # while exit hasn't been chosen
    while choice != "6":
        choice = display_menu()

        # get average rating and max and min rating
        if choice == "1":
            averages = get_average_rating(restaurants)
            highest_cuisine = max(averages, key=averages.get)
            lowest_cuisine = min(averages, key=averages.get)

            # prints each cuisine type with number of instances
            for cuisine_type in averages:
                print(f"{cuisine_type}: {round(float(averages[cuisine_type]), 2)}/5")

            # prints max and min rated cuisines
            print(f"Highest Rating: {highest_cuisine} with a {averages[highest_cuisine]:.2f}/5")
            print(f"Lowest Rating: {lowest_cuisine} with a {averages[lowest_cuisine]:.2f}/5")

        # get filtered restaurants
        if choice == "2":
            filtered = get_filtered_restaurants(get_valid_int("Please enter the minimum rating for a restaurant:",
                                                              "Please enter an integer between 0 and 5", 0, 5),
                                                get_valid_int("Please enter the minimum price for a restaurant:",
                                                              "Please enter a valid integer", 0),
                                                get_valid_int('Please enter the maximum price for a restaurant:',
                                                              'Please enter a valid integer', 1),
                                                restaurants)
            write_to_file(filtered)
            print("The new file has been created")

        # displays graph
        if choice == "3":
            display_graph(get_price_for_two(restaurants))
            print("Graph has been created")

        # get most popular cuisine
        if choice == "4":
            popularity = get_most_popular_cuisine_type(restaurants)
            for cuisine_type in popularity:
                print(f"{cuisine_type} with {popularity[cuisine_type]} restaurants")
            most_popular_cuisine = max(popularity, key=popularity.get)
            print(
                f"\nThe most popular cuisine type is {most_popular_cuisine} with {popularity[most_popular_cuisine]} restaurants")

        # get new restaurant data
        if choice == "5":
            restaurants = get_restaurant_data(get_filename())
            print("New data has been loaded")

    # send off to the user
    print("\nThank you for using this program!")


main()
