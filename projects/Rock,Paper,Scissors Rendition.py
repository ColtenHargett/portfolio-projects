import random
import math

choices = ["knight", "archer", "mage", "pikeman", "rogue"]


def validate_response(question, valid_answers):
    # ask for input
    user_input = input(question).strip().lower()

    # keep looping until a valid response is entered
    while user_input not in valid_answers:
        print("Invalid input. Please try again.")
        user_input = input(question).strip().lower()

    return user_input


def computer_turn():
    # get random choice
    computer_choice = random.choice(choices)
    return computer_choice


def player_turn(player):
    # get valid response from player
    player_choice = validate_response(f"{player}: What do you want to play? ", choices)
    return player_choice


def determine_winner(choice1, choice2):
    # list of what beats what
    rules = {
        "mage": ["pikeman", "knight"],
        "pikeman": ["knight", "archer"],
        "knight": ["archer", "rogue"],
        "archer": ["rogue", "mage"],
        "rogue": ["mage", "pikeman"]
    }

    # winner logic
    if choice1 == choice2:
        outcome = "tie"
    elif choice2 in rules[choice1]:
        outcome = "player1"
    else:
        outcome = "player2"
    return outcome


def play_round(player1_name, player1_type, player2_name, player2_type):
    # player1 turn
    if player1_type == "human":
        player1_choice = player_turn(player1_name)
    else:
        player1_choice = computer_turn()

    # player2 turn
    if player2_type == "human":
        player2_choice = player_turn(player2_name)
    else:
        player2_choice = computer_turn()

    # print who chose what
    print(f"{player1_name} chose {player1_choice}. {player2_name} chose {player2_choice}.")

    # decide winner
    result = determine_winner(player1_choice, player2_choice)

    # decide result of the round
    if result == "tie":
        return None
    elif result == "player1":
        return player1_name
    else:
        return player2_name


def play_match(player1_name, player1_type, player2_name, player2_type, best_of):
    # initialize variables
    player1_wins = 0
    player2_wins = 0
    player1_goes_first = True

    # loop until a player wins
    while player1_wins < math.ceil(best_of / 2) and player2_wins < math.ceil(best_of / 2):
        if player1_goes_first:
            winner = play_round(player1_name, player1_type, player2_name, player2_type)
        else:
            winner = play_round(player2_name, player2_type, player1_name, player1_type)

        # increment wins based off of winner
        if winner == player1_name:
            print(f"{player1_name} wins the round!")
            player1_wins += 1
        elif winner == player2_name:
            print(f"{player2_name} wins the round!")
            player2_wins += 1
        else:
            print(f"It's a tie! Replay the round!")

        # output score
        print(f"{player1_name}'s score: {player1_wins}\n"
              f"{player2_name}'s score: {player2_wins}\n")

        # Alternate who goes first
        player1_goes_first = not player1_goes_first

    # determine who won the match
    if player1_wins > player2_wins:
        print(f"Congrats {player1_name}! You win the match with a score of {player1_wins} - {player2_wins}.")
        winner = player1_name
    else:
        print(f"Congrats {player2_name}! You win the match with a score of {player2_wins} - {player1_wins}.")
        winner = player2_name

    return winner


def main():
    rematch = True

    # output rules of the game
    print("Welcome to Medieval Clash!"
          "\nIn this game, two players face off in a head-to-head battle."
          "\nEach round, both players choose one of the five medieval champions:"
          "\nKnight, Archer, Mage, Pikeman, or Rogue.\n"
          "\nThe rules are simple:"
          "\n- Mage defeats Pikeman and Knight."
          "\n- Pikeman defeats Knight and Archer."
          "\n- Knight defeats Archer and Rogue."
          "\n- Archer defeats Rogue and Mage."
          "\n- Rogue defeats Mage and Pikeman.\n"
          "\nIf both players choose the same champion, the round ends in a tie and must be replayed.\n")

    # loop until user doesn't want a rematch
    while rematch:

        # determine the game type
        game_type = validate_response("What game mode do you want? (Player vs Player, Player vs Computer,"
                                      " or Computer vs Computer) ", ['player vs player', 'player vs computer',
                                                                     'computer vs computer'])

        # determine what the best of is
        best_of = input("How many rounds do you want to play out of? ").strip()
        while not (best_of.isdigit() and int(best_of) % 2 == 1 and int(best_of) >= 1):
            print("Invalid input. Please input a valid odd integer.")
            best_of = input("How many rounds do you want to play out of? ")
        best_of = int(best_of)

        # game setup for player vs player
        if game_type == "player vs player":
            player1_type = "human"
            player2_type = "human"
            player1_name = input("What is the name of the first player? ").strip()
            player2_name = input("What is the name of the second player? ").strip()

        # game setup for player vs computer
        elif game_type == "player vs computer":
            player1_type = "human"
            player2_type = "computer"
            player1_name = input("What is your name? ").strip()
            player2_name = 'Computer'

        # game setup for computer vs computer
        else:
            player1_type = "computer"
            player2_type = "computer"
            player1_name = "Computer 1"
            player2_name = "Computer 2"

        play_match(player1_name, player1_type, player2_name, player2_type, best_of)

        # determine if user wants a rematch
        rematch_response = validate_response("Do you want to play again? (yes or no) ", ["yes", "no"])
        if rematch_response == "no":
            rematch = False
            print("Thank you for playing!")


main()
