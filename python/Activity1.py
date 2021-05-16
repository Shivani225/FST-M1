Name = input('Enter your name: ')
Age = int(input('Enter your Age: '))
Year = (100 - Age) + 2021
Message = "Hello {} ! You will turn 100 Years in the year {}."
print(Message.format(Name,Year))
