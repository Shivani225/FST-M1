from typing import Tuple


TupleList = tuple(input("Enter comma separated values for the first list: ").split(","))
print(TupleList)

print("The numbers in the tuple divisible by 5 are: ")
for t in TupleList:
    if(int(t) % 5 == 0):
        print(t)
