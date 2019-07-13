import sys

def func():
    curr_list = receive()
    curr_list.sort()
    b = curr_list[0][1]
    ans = 1
    for i in range(1, len(curr_list)):
        if (b > curr_list[i][1]):
            ans += 1
            b = curr_list[i][1]
    print (ans)

def receive():
    n = int(sys.stdin.readline())
    total_list = []
    for _ in range(n):
        a, b = map(int, sys.stdin.readline().split())
        total_list.append((a,b))
    return total_list


def main():
    tc = int(sys.stdin.readline())
    for _ in range(tc):
        func()
main()