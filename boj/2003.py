import sys
n, m = map(int, sys.stdin.readline().rstrip().split())
sum = count = left = right = 0
arr = [int(i) for i in sys.stdin.readline().rstrip().split()]
while(True):
    if (sum >= m):
        sum -= arr[left]
        left += 1
    elif(right == n):
        break
    else:
        sum += arr[right]
        right += 1
    if (sum == m):
        count += 1
sys.stdout.write("%d\n"%count)