import sys

n = int(sys.stdin.readline()[:-1])
m = {'temp':0}
for _ in range(n):
    name = input().split()[0]
    if (m.get(name, 0) == 1):
        m[name] = 0
    else:
        m[name] = 1

leave = []
for k in m.keys():
    if(m[k] == 1):
        leave.append(k)
for a in leave:
    print (a)