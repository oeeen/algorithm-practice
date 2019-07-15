import sys

def func():
    n = int(sys.stdin.readline())
    num = []
    for _ in range(n):
        num.append(int(sys.stdin.readline()))
    num.sort()
    for i in range(n):
        sys.stdout.write('%d\n'%num[i])
func()