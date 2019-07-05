def calc():
    n, m = map(int, input().split())
    ans = 1

    for i in range(n):
        ans = ans * (m - i) / (i + 1)
    print (int(ans))

def main():
    tcCount = int(input())

    while (tcCount != 0):
        tcCount -= 1
        calc()

main()