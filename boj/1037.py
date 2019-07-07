def calc():
    n = int(input())

    divisor = [int(x) for x in input().split()]
    
    divisor.sort()

    print(divisor[0] * divisor[-1])

calc()