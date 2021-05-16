def fibonacci(num):
    if(num<=1):
        return num
    else:
        return(fibonacci(num-1)+fibonacci(num-2))

fnum = int(input("Enter a valid number: "))

if fnum <= 0:
    print("Enter a number greater than 0")
else:
    for x in range(fnum):
        print(fibonacci(x))
