def main():
    for _ in range(int(input())):
        func()

def func():
    n = int(input())
    curr = 1
    for _ in range(n - 1):
        curr = curr * 2 + 1
    print (curr)
main()