import random

top_of_range = input("Enter a number: ")

if top_of_range.isdigit():
    top_of_range = int(top_of_range)

    if top_of_range <= 0:
        print('Please enter a number larger than 0.')
        quit()
else:
    print('Please type a number')
    quit()

random_number = random.randrange(0, top_of_range)
guesses = 0
while True:
    guesses += 1
    user_guess = input("Make a guess: ")
    if user_guess.isdigit():
        user_guess = int(user_guess)
    else:
        print('Please enter a number next time. ')
        continue

    if user_guess == random_number:
        print("You are correct! ")
        break
    elif user_guess > random_number:
        print("You guessed too HIGH! Please try again.")
    else:
        print("You guessed too LOW! Please try again.")

print("Congratulations! You got it right in", guesses, "guesses!")
