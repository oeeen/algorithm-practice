import sys

n = int(sys.stdin.readline()[:-1])
num = [int(i) for i in sys.stdin.readline()[:-1].split()]
num.sort()

def binary_search(tmp):
    l = 0
    r = n - 1
    while (l <= r):
        mid = (l+r) // 2
        if (num[mid] == tmp):
            return 1
        elif (num[mid] > tmp):
            r = mid - 1
        else:
            l = mid + 1
    return 0


m = int(sys.stdin.readline()[:-1])
for i in list(map(int, input().split())):
    print(binary_search(i),  end = ' ')
print()
