x, y = map(int, input().split())
n = int(input())
ans = y/x
for _ in range(n):
    xx, yy = map(int, input().split())
    if (yy/xx > ans):
        ans = yy/xx
print (1000 / ans)