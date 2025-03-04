print("Welcome to my computer quiz!")

playing = input("Would you like to play a game? ")

if playing != "yes":
    quit()

print("Okay! Let's play a game :) ")
score = 0

answer = input("What year did Germany invade Poland? ")
if answer == "1939":
    print("Correct! ")
    score += 1
else:
    print("Incorrect! The answer is 1939. ")

answer = input("What year did Germany surrender? ")
if answer == "1945":
    print("Correct! ")
    score += 1
else:
    print("Incorrect! The answer is 1945. ")

answer = input("Where did D-Day take place? ")
if answer == "normandy":
    print("Correct! ")
    score += 1
else:
    print("Incorrect! The answer is Normandy. ")

answer = input("What country was attacked by Japan on December 7, 1941? ")
if answer == "united states":
    print("Correct! ")
    score += 1
else:
    print("Incorrect! The answer is United States. ")

answer = input("What were German submarines called? ")
if answer == "u boats":
    print("Correct! ")
    score += 1
else:
    print("Incorrect! The answer is U Boats. ")

answer = input("Who was nicknamed Old Blood and Guts? ")
if answer == "george patton":
    print("Correct! ")
    score += 1
else:
    print("Incorrect! The answer is George Patton. ")

answer = input("What ship sank H.M.S. Hood? ")
if answer == "bismark":
    print("Correct! ")
    score += 1
else:
    print("Incorrect! The answer is Bismark. ")

answer = input("Onboard what ship did the Japanese sign their surrender? ")
if answer == "uss missouri":
    print("Correct! ")
    score += 1
else:
    print("Incorrect! The answer is USS Missouri. ")

print("You got " + str(score) + " questions correct!")
print("Your score is: " + str((score / 8 ) * 100) + "%.")