# Programmers: Colten, Westley
# Course:  CS151, Dr. Isaacman
# Due Date: 11/ 12/ 2025
# Lab Assignment: Lab 11
# Problem Statement: Convert morse code to english
# Data In: Morse code, Morse code translation
# Data Out: English translation
# Credits: N/A
# Input Files: Morse code to English translation, Morse code to translate

import os


# gets a file name that exists
def get_file_name(prompt):
    # ask user for file name
    file_name = input(prompt).strip().lower()

    # check if file exists
    while not os.path.exists(file_name):
        print("File doesn't exist")
        file_name = input(prompt).strip().lower()

    return file_name


# gets the conversion table from file
def get_conversion(file_name):
    conversion_table = {}

    # open file
    file = open(file_name, "r")

    # creates conversion table
    for line in file:
        conversion = line.split()
        conversion_table[conversion[1].strip()] = conversion[0].strip()

    # returns the conversion table as a dict
    return conversion_table


# gets the morse code to translate from file
def get_morse_code(file_name):
    data = []

    # open file
    file = open(file_name, "r")

    # get data in file
    for line in file:
        data.append(line.split())
    file.close()

    return data


# translates morse code to english
def convert_morse_code(conversion, morse_code):
    translation = []
    translated_letters = []

    # translates each letter of morse code
    for word in morse_code:
        for letter in word:
            if letter in conversion:
                translated_letters.append(conversion[letter])
        translation.append(translated_letters)
        translated_letters = []

    # returns the list of the translated words
    return translation


# write the translation to a new file (No return)
def write_to_file(translation, file_name):
    # open file
    file = open(file_name, "w")

    # writes each word with a space
    for word in translation:
        for letter in word:
            file.write(letter)
        file.write(" ")

    # closes file
    file.close()


def main():
    # introduction
    print("Welcome to Morse Code Converter")
    print("-" * 30)

    # gets the translation from user file
    conversion_table = get_conversion(get_file_name("Please enter the conversion list from English to Morse Code: "))
    print()

    # gets the morse code from user file
    morse_code = get_morse_code(get_file_name("Please enter the Morse Code to translate: "))
    print()

    # does translation and writes to a file of the users choice
    translation = convert_morse_code(conversion_table, morse_code)
    write_to_file(translation, input("Please enter the output file name: "))

    # send off
    print("\nThe new file has been created")
    print("Thank you for using Morse Code Converter")


main()
