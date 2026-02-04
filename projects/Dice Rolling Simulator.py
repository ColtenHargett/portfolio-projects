import random


# Roll two 6 sided dice and return their sum
def roll_pair_dice():
    return random.randint(1, 6) + random.randint(1, 6)


# Roll a pair of dice number_of_rolls times and return a list of sums
def roll_bunch_dice(number_of_rolls):
    rolls = []
    for i in range(number_of_rolls):
        rolls.append(roll_pair_dice())
    return rolls


# Count how many times each possible sum (2–12) appears
def count_rolls(rolls):
    counted_rolls = []
    count = 2
    while count <= 12:
        counted_rolls.append(rolls.count(count))
        count += 1
    return counted_rolls


# rolls and counts the sum of each roll
def roll_and_count(number_of_rolls):
    counted_rolls = count_rolls(roll_bunch_dice(number_of_rolls))
    return counted_rolls


# Converts the list to stars, scaled so the longest bar has at most max_stars
def convert_to_stars(counted_list):
    max_stars = 50
    max_count = max(counted_list)

    # Decide scale
    if max_count <= max_stars:
        scale = 1
    else:
        scale = max_count / max_stars

    # Legend
    if scale == 1:
        print("(Legend: 1 '*' = 1 roll)")
    else:
        print(f"(Legend: 1 '*' ≈ {scale:.2f} rolls)")

    # Print each sum with scaled stars
    count = 0
    while len(counted_list) > count:
        original_count = counted_list[count]

        if scale == 1:
            star_count = original_count
        else:
            star_count = int(round(original_count / scale))
            if original_count > 0 and star_count == 0:
                star_count = 1

        print(f"Sum of {count + 2} ", "*" * star_count)
        count += 1

    return None


# get a valid integer from the user
def get_valid_input(prompt):
    user_in = input(prompt).strip().lower()
    while not (user_in.isdigit() and int(user_in) > 0):
        print("Please enter a valid number.")
        user_in = input(prompt).strip().lower()
    return int(user_in)


# main function
def main():
    print("Welcome to the dice rolling simulator!")
    number_of_rolls = get_valid_input("Please enter the number of rolls to simulate: ")
    rolls = roll_and_count(number_of_rolls)
    print(f"You rolled {number_of_rolls} pairs of dice")
    print(f"Roll totals: {rolls}\n")
    convert_to_stars(rolls)


main()
