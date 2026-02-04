import os
import string


def get_valid_file():
    # gets file name
    valid_file = input("Please enter a file to use: ").strip().lower()

    # keep asking the user for a file name while file doesn't exist
    while not os.path.exists(valid_file):
        print("Invalid file. Please try again.")
        valid_file = input("Please enter a file to use: ").strip().lower()

    return valid_file


def read_file(file_name):
    data = []
    # if file exists, open the file
    if os.path.exists(file_name):
        input_file = open(file_name, "r")

        # creates a nested list of each song and artist
        for line in input_file:
            parts = line.split("/")
            cleaned_parts = []
            for part in parts:
                cleaned = part.strip().lower()
                cleaned_parts.append(cleaned)
            data.append(cleaned_parts)
        input_file.close()
        return data
    else:
        return False


def search(string_in, nested_list):
    count = 0
    string_in = string_in.strip().lower()

    # searches through each word and increments count each time
    for items in nested_list:
        for item in items:
            words = item.split()
            for word in words:
                cleaned_word = word.strip(string.punctuation).strip().lower()
                if cleaned_word == string_in:
                    count += 1
    return count


def average_song_characters(nested_list):
    char_count = 0
    checked = 0

    # counts all the characters in each song
    for items in nested_list:
        char_count += len(items[1])
        checked += 1

    # returns average
    return char_count/checked


def filter_and_export(string_in, nested_list, file_name):
    found = []

    # add each item found to found list
    for items in nested_list:
        if string_in in items[1]:
            found.append(items[1].title() + ' by ' + items[0].title())

    # writes to file
    outfile = open(file_name, "w")
    outfile.write("\n".join(found))
    outfile.close()


def find_longest(nested_list):
    longest = nested_list[0][1]

    # finds the longest song name
    for items in nested_list:
        if len(items[1]) > len(longest):
            longest = items[1]
    return longest


def find_songs_by_artist(nested_list, artist):
    songs = []
    # searches each item for the artist and appends
    for items in nested_list:
        if artist.strip().lower() == items[0]:
            songs.append(items)
    return songs


def print_menu():
    print("\n---------------- MENU -----------------")
    print("1. Search by word or phrase")
    print("2. Filter and export to a new file")
    print("3. Average length analysis")
    print("4. Find longest song name")
    print("5. Find songs by artist")
    print("6. Load a new file")
    print("7. Quit")
    print("-----------------------------------------")


def get_menu_choice():
    choice = input("Please enter your choice: ").strip().lower()
    while not (choice.isdigit() and 1 <= int(choice) <= 7):
        print("Invalid choice. Please try again.")
        choice = input("Please enter your choice: ").strip().lower()
    return choice


def main():
    # introduction
    print("Welcome to Song Analyzer")
    print("-" * 25)

    # gets the file name and reads it
    file_name = get_valid_file()
    file = read_file(file_name)
    print("\nLoaded file: " + file_name)
    print(f"File length: {len(file)} entries")
    choice = 0

    # while choice isn't quit
    while choice != 7:
        print_menu()
        choice = int(get_menu_choice())
        print()

        # Search choice
        if choice == 1:
            search_word = input("Please enter a word to search for: ").strip().lower()
            search_count = search(search_word, file)
            print(f"There are {search_count} instances of {search_word} in {file_name}.")

        # filter and export choice
        elif choice == 2:
            filter_str = input("Please enter a phrase to filter: ").strip().lower()
            new_file_name = input("Please enter a new file name: ").strip()
            filter_and_export(filter_str, file, new_file_name)
            print("The new file has been saved to: " + new_file_name)

        # average length choice
        elif choice == 3:
            print(f"The average length of songs found: {round(average_song_characters(file), 2)}")

        # longest song name choice
        elif choice == 4:
            print(f"The longest song name found: {find_longest(file).title()}")

        # search for artist choice
        elif choice == 5:
            artist = input("Please enter your artist to search for: ").strip().lower()
            songs = find_songs_by_artist(file, artist)
            print(f"There are {len(songs)} songs found in {file_name} by {artist.title()}:")
            for song in songs:
                print(song[1].title())

        # new file choice
        elif choice == 6:
            file_name = get_valid_file()
            file = read_file(file_name)
            print(f"New file has been loaded: " + file_name)

    # send off
    print("Thank you for using Song Analyzer!")


main()
