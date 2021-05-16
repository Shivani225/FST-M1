Player1 = input("Enter the name of Player 1: ")
Player2 = input("Enter the name of Player 2: ")

choice_Player1 = input(Player1 + " ,what do you choose in Rock, Paper, Scissor?").lower()
choice_Player2 = input(Player2 + " ,what do you choose in Rock, Paper, Scissor?").lower()

if(choice_Player1 == choice_Player2):
    print("It is a tie!")
elif(choice_Player1 =="rock"):
    if(choice_Player2 == "paper"):
        print("Paper Wins!")
    else:
        print("Scissor Wins!")
elif(choice_Player1 =="paper"):
    if(choice_Player2 == "scissor"):
        print("scissor Wins!")
    else:
        print("Rock Wins!")
elif(choice_Player1 =="scissor"):
    if(choice_Player2 == "rock"):
        print("Rock Wins!")
    else:
        print("Paper Wins!")
else:
    print("Invalid Input! Please select something in Rock, Paper or Scissor")
