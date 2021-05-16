List_Numbers = list(input("Enter comma separated values for the list: ").split(","))
print(List_Numbers)

if(List_Numbers[0] == List_Numbers[-1]):
    print(True)
else:
    print(False)
