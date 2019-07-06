def calc():
    n = int(input())

    a = [int(x) for x in input().split()]
    b = [int(x) for x in input().split()]

    a.sort()
    b.sort(reverse=True)
    sum = 0
    
    for i in range(len(a)):
        sum += a[i] * b[i]
    
    print (sum)

calc()