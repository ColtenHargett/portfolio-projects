import random

# initialize variables
color_codes = ["\033[0;30m", "\033[0;31m", "\033[0;32m", "\033[0;33m", "\033[0;34m", "\033[0;35m", "\033[0;36m", "\033[0;37m", "\033[1;30m", "\033[1;31m", "\033[1;32m", "\033[1;33m", "\033[1;34m", "\033[1;35m", "\033[1;36m"]
colors = ["black", "red", "green", "brown", "blue", "purple", "cyan", "light gray", "dark gray", "light red", "light green", "yellow", "light blue", "light purple", "light cyan"]
valid_chars = ['<', '>', '=', '~', '^', '&', '|', '?', '*', '{', '}', '[', ']', '(', ')', '^', '%', '+', '-']
options = ['circle', 'line', 'christmas tree', 'star', 'present']


# gets an odd number from the user
def validate_odd_number(prompt, error_msg):
    response = input(prompt + " ").strip()

    while not (response.isdigit() and int(response) >= 3 and int(response) % 2 == 1):
        print(error_msg)
        response = input(prompt + " ").strip()

    return int(response)


# gets a valid number from the user
def validate_number(prompt, error_msg):
    response = input(prompt + " ").strip()

    while not (response.isdigit() and int(response) > 0):
        print(error_msg)
        response = input(prompt + " ").strip()

    return int(response)


# gets a valid character from the user
def validate_char_string(prompt, valid_response, error_msg):
    found = False
    response = input(prompt + " ").strip()

    for char in response:
        if char not in valid_response:
            found = False
            break
        else:
            found = True

    while not found:
        print(error_msg)
        response = input(prompt + " ").strip()

        for char in response:
            if char not in valid_response:
                found = False
                break
            else:
                found = True

    return response


# gets a valid input from the user
def validate_input(prompt, valid_responses, error_msg):
    response = input(prompt + " ").strip().lower()

    while response not in valid_responses:
        print(error_msg)
        response = input(prompt + " ").strip().lower()

    return response


# prints a circle
def print_circle():
    lines = [
        "    ******    ",
        " **        ** ",
        "**          **",
        "**          **",
        " **        ** ",
        "    ******    ",
    ]

    for line in lines:
        print(line)


# prints a repeating pattern on a set of lines
def print_line(lines, char, repeat):
    count = 1

    while count <= lines:
        print(char * repeat)
        count += 1


# prints a Christmas tree
def print_christmas_tree(color):
    color_code = color_codes[colors.index(color)]
    lines = 1
    asterisk = 1

    while lines <= 7:
        print(" " * (7 - lines), color_code + "*" * asterisk)
        asterisk += 2
        lines += 1

    while lines <= 11:
        print(" " * 5, "\033[37m" + "| |")
        lines += 1
    print("\033[0m")


# prints a star
def print_star(size):
    yellow = '\033[33m'
    space_count = size // 2
    char_count = 1

    while char_count <= size:
        print(yellow + (" " * space_count) + ("^" * char_count))
        char_count += 2
        space_count -= 1

    char_count -= 2
    space_count += 1

    while char_count > 0:
        space_count += 1
        char_count -= 2
        print(yellow + (" " * space_count) + ("^" * char_count) + "\033[0m")


# prints a present
def print_present(box_color, ribbon_color):
    reset = "\033[0m"
    box_color_code = color_codes[colors.index(box_color)]
    ribbon_color_code = color_codes[colors.index(ribbon_color)]

    print(ribbon_color_code + " " * 7 + "\\" + " " + "/" + ' ' * 5 + reset)
    print(box_color_code + "# " * 4 + ribbon_color_code + "# " + box_color_code + "# " * 4 + reset)
    count = 1

    while count < 8:
        if count == 4:
            print(ribbon_color_code + "# " * 9 + reset)
            count += 1
        print(box_color_code + "#" + " " * 7 + ribbon_color_code + "#" + " " * 7 + box_color_code + "#" + reset)
        count += 1
    print(box_color_code + "# " * 4 + ribbon_color_code + "# " + box_color_code + "# " * 4 + reset)


# gets a random custom drawing
def random_drawing():
    random_number = random.randint(1, 3)

    if random_number == 1:
        print_christmas_tree(validate_input("Please enter a color for your Christmas Tree:", colors, f"Please enter a valid color ({', '.join(colors)})."))

    elif random_number == 2:
        print_star(validate_odd_number("Please enter an odd number for the size of your star:", "Please enter a valid odd number above 2."))

    else:
        print_present(validate_input("Please enter a color for the box of your present:", colors, f"Please enter a valid color ({', '.join(colors)})."), validate_input("Please enter a color for the ribbon of your present:", colors, f"Please enter a valid color ({', '.join(colors)})."))


# main function
def main():
    print("Welcome to the ASKII art generator")
    response = ""

    while response != "quit":
        response = validate_input("What would you like to draw (type exit to quit):", ['circle', 'line', 'random'],
                                  f"Please enter a valid option ({', '.join(['circle', 'line', 'random'])}).")

        if response == options[0]:
            print_circle()

        if response == options[1]:
            print_line(validate_number("Please enter how many lines you would like to cover:", "Please enter a valid number of lines."), validate_char_string("Please enter the characters you would like to use:", valid_chars, f"Please enter a valid character ({', '.join(valid_chars)})."), validate_number("Please enter how many times you would like your characters to repeat:", "Please enter a valid number."))

        else:
            random_drawing()


main()
