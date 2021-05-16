List1 = list(input("Enter comma separated values for the first list: ").split(","))
List2 = list(input("Enter comma separated values for the second list: ").split(","))

print(List1)
print(List2)

odd_list =[]
even_list =[]

for o in List1:
    if(int(o) % 2 != 0):
        odd_list.append(o)
print(odd_list)
    
for e in List2:
    if(int(e) % 2 == 0):
        even_list.append(e)
print(even_list)

print("New List with odd and even numbers from each list is: ")
print(odd_list + even_list)

