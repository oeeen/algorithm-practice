def calc():
    n = int(input())
    count = 0
    for i in range(1, n+1):
        count += findNumber(str(i))
    print(count)

def findNumber(num):
    if (len(num) == 1):
        return 1
    if (len(num) == 2):
        return 1
    diff = int(num[0]) - int(num[1])
    for i in range(1, len(num) - 1):
        if (int(num[i]) - int(num[i + 1]) == diff):
            pass
        else:
            return 0

    return 1

calc()