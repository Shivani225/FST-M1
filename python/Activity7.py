Numbers = list(input("Enter the numbers separated by comma :").split(","))
print(Numbers)
sum = 0

for n in Numbers:
    sum = sum + int(n)

print("Sum of the numbers in the list is: " + str(sum))





