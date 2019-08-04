while(True):
    a = [int(i) for i in input().split()]
    if (a[0] == a[1] == a[2] == 0):
        break
    a.sort()
    if (a[2]**2 == a[1]**2 + a[0]**2):
        print("right")
    else:
        print("wrong")