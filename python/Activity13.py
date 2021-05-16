def sum(*numbers):
    print(numbers)
    sum = 0
    
    for n in numbers:
        sum = sum + n
    return sum


result = sum(10,20,30,40)

print(result)
    
