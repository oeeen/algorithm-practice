def calc():
    a, b = map(int, input().split())
    rem = 1
    count = (b-1)%4 + 1

    for i in range(count):
        rem = (rem * a) % 10
    if (rem == 0):
        rem = 10
    print (rem)

def main():
    tcCount = int(input())

    for i in range(tcCount):
        calc()

main()