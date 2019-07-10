def func():
    count = 0
    for i in range(8):
        n = input()
        for j in range(8):
            if (i % 2  == 0 and ((i * 8) + j) % 2 == 0 and n[j] == 'F'):
                count += 1
            if (i % 2  == 1 and ((i * 8) + j) % 2 == 1 and n[j] == 'F'):
                count += 1
    print (count)

func()