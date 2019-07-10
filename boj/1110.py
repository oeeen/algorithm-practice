def func(n):
    if (n < 10):
        return n * 10 + n
    else:
        return (n%10) * 10 + (n//10 + n%10)%10

def main():
    n = int(input())
    current = func(n)
    count = 1
    while (current != n):
        current = func(current)
        count += 1
    print (count)

main()