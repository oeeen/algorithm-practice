def func():
    a = int(input())
    x = int(input())
    powerA = []
    count = 1
    curr = a
    first = True
    powerA.append(a)
    for _ in range(64):
        curr = pow(curr, 2) % (pow(10, 9) + 7)
        powerA.append(curr)

    while (True):
        if (x == 0):
            break
        if (x & 0x1 == 0x1):
            if (first):
                a = powerA[count-1] % (pow(10, 9) + 7)
                first = False
            else:
                a = (a * powerA[count-1]) % (pow(10, 9) + 7)
        x = x >> 1
        count += 1
    print (a)


func()