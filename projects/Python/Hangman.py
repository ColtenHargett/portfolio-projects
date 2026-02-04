# determines if the inputted string has any digits within
def contains_digit(string):
    # loops through each character to check if there is a digit
    for char in string:
        if char.isdigit():
            return True
    return False


# gets a valid word from the user
def get_word(prompt):
    # gets word from user using the provided prompt
    word = input(prompt + " ").lower().strip()

    # error checking for the word
    while len(word) < 5 or contains_digit(word):
        print("Word must be at least 5 characters long and contain only letters. Try again.")
        word = input(prompt + " ").lower().strip()
    return word


# gets a valid guess from the user
def get_guess(prompt, guessed):
    # gets guess from user using the provided prompt
    guess = input(prompt + " ").lower().strip()

    # error checking for the guess
    while len(guess) != 1 or contains_digit(guess) or guess in guessed:
        print("Guess must contain only 1 letter that hasn't been used already. Try again.")
        guess = input(prompt + " ").lower().strip()
    return guess


# mask the word with blanks
def mask_word(word, guessed):
    masked_letters = []

    # loop through each letter to determin if it should be revealed or not
    for char in word:
        if char in guessed:
            masked_letters.append(char)
        else:
            masked_letters.append("_")
    return "".join(masked_letters)


# adding the guess to a list of all guesses
def apply_guess(word, guess, guessed):
    guessed.append(guess)

    # print and return outcome of the guess
    if guess in word:
        print("You got a letter\n")
        return True
    else:
        print("Wrong letter\n")
        return False


# calculate how many wrong guesses were made
def calculate_lives(word, guess, lives):
    # loops through each guess and checks it against the word
    for char in guess:
        if char not in word:
            lives -= 1
    return lives


# displays information about the game
def display_game_state(word, guessed, lives):
    print("Word:", mask_word(word, guessed))
    print("Lives:", lives)
    print("Guessed:", ", ".join(sorted(guessed)))


# checks to see if the game is over
def determine_win(word, guessed):
    # loops through each letter in the word to see if the word has been fully guessed
    for char in word:
        if char not in guessed:
            return False
    return True


# play a round of the game
def play_round():
    # get word and initialize variables
    word = get_word("Please enter a word:")
    print("\n" * 20)  # to remove the word from sight of the other player
    guessed = []
    lives = 5
    win = False

    # loop through guesses until game over
    while lives > 0 and not win:
        display_game_state(word, guessed, lives)
        print("\n")
        guess = get_guess("Please enter a guess:", guessed)
        apply_guess(word, guess, guessed)
        lives = calculate_lives(word, guess, lives)
        win = determine_win(word, guessed)

    # determine if player won or lost depending on count of lives
    if lives > 0:
        print("You won!")
    else:
        print("Sorry You lost!")
    print(f'The word was "{word}"')


# main function
def main():
    # greet user and initialize variables
    print("Welcome to Hangman!\n")
    play = True

    # while user wants to play
    while play:
        play_round()

        # ask if user wants to play again
        user_in = input("\nPlay again? (y/n): ").lower().strip()

        # error checking rematch question
        while user_in != "y" and user_in != "n":
            print("Please enter y or n.")
            user_in = input("Play again? (y/n): ").lower().strip()

        # determine if user wants to play again
        if user_in == "y":
            print("\n" * 3)
            play = True
        else:
            play = False
    print("Thank you for playing!")


main()
