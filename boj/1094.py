def calc():
    userInput = int(input())
    count = 0
    
    while (userInput != 0):
        count += userInput & 1
        userInput = userInput >> 1

    print (count)

calc()