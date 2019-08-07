import sys
n, m = map(int, sys.stdin.readline().rstrip().split())
sum = 0
rem = n
while (True):
    sum += rem
    rem = rem // m
    if (rem < m):
        break
sum += rem
sys.stdout.write('%d\n'%sum)