def calcsum(number):
    if number:
        return number + calcsum(number - 1)
    else:
        return 0

result = calcsum(10)

print(result)