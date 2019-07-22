def getPrimes(n):
    n = n + 1
    seive = [True] * n
    for i in range(2, int(n ** 0.5) + 1):
        if (seive[i]):
            for j in range(i*2, n, i):
                seive[j] = False
    return len([x for x in range(2, n) if seive[x]])

def solution():
    n = int(input())
    while(n != 0):
        print (getPrimes(2 * n) - getPrimes(n))
        n = int(input())

solution()