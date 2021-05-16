fruits = {
    "mango" : 20,
    "banana" : 30,
    "apple" : 40,
    "pomegranate" : 50
}

fruitcheck = input("Enter the name of the fruit: ").lower()

if(fruitcheck in fruits):
    print(("Yes!! {} is availble").format(fruitcheck))
else:
    print(("Sorry, {} is not available").format(fruitcheck))