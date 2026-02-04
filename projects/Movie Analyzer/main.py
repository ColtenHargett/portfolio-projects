import os
DATE = 0
NAME = 1
BUDGET = 2
DOMESTIC_GROSS = 3
WORLDWIDE_GROSS = 4
PROFIT = 5


# gets a valid file name from the user and returns that file name
def get_file_name():
    file_name = input("Enter file name to read: ").strip().lower()

    # while the file doesn't exist, keep asking the user for a file name
    while not os.path.exists(file_name):
        print("File does not exist. Please enter a valid file name.")
        file_name = input("Enter file name to read: ").strip().lower()

    return file_name


# reads in file and returns a nested list of the data
def read_file(file_name):

    # initialize and open file
    data = []
    file = open(file_name, "r")

    # split each line to create a nested lit of all the data
    for line in file:
        data.append(line.strip().split(','))

    # appends the profit for each movie on the end of their list
    index = 0
    while index < len(data):
        profit = int(data[index][WORLDWIDE_GROSS]) - int(data[index][BUDGET])
        data[index].append(str(profit))
        index += 1

    return data


# obtain the highest profit movie from list and returns the list from that movie (doesn't return anything)
def get_highest_profit(data):
    current_highest = [0, 0, 0, 0, 0, 0]

    # loops through each line and finds the movie with the highest profit
    for movie in data:
        if int(movie[PROFIT]) > int(current_highest[PROFIT]):
            current_highest = movie

    # output all the information to the user
    print(f"The movie with the highest profit is {current_highest[NAME]}",)
    print(f"{current_highest[NAME]} released on {current_highest[DATE]}", )
    print(f"{current_highest[NAME]} had a budget of ${current_highest[BUDGET]}")
    print(f"{current_highest[NAME]} domestically grossed ${current_highest[DOMESTIC_GROSS]}", )
    print(f"{current_highest[NAME]} grossed ${current_highest[WORLDWIDE_GROSS]} worldwide", )


# writes to the new file (doesn't return anything)
def write_to_file(data, file_name):
    # opens file to write
    file = open(file_name, "w")

    # loops through each item in nested list to write to the new file
    for movie in data:
        for info in movie:
            file.write(info + ",")
        file.write('\n')


# doesnt return anything for main function
def main():
    # introduction
    print("Welcome to Movie Analyzer")
    print("-" * 28)

    # gets the data from input file
    data = read_file(get_file_name())

    # writes data to new file
    write_to_file(data, input("Enter file name to write: "))
    print()

    # prints the highest profit movie from the list
    get_highest_profit(data)

    # send off
    print("\nThank you for using Movie Analyzer")


main()
