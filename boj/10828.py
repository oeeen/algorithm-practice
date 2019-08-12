import sys
arr = []

def push(n:int):
    arr.append(n)

def pop() -> int:
    if (len(arr) != 0):
        return arr.pop()
    else :
        return -1

def size() -> int:
    return len(arr)

def empty() -> int:
    if (len(arr) == 0):
        return 1
    else :
        return 0
    
def top() -> int:
    if (len(arr) == 0):
        return -1
    else :
        return arr[len(arr)-1]

def main():
    n = int(sys.stdin.readline().rstrip())
    for _ in range(n):
        cmd = sys.stdin.readline().rstrip()
        if ("push" in cmd):
            push(int(cmd.split()[1]))
        elif ("pop" in cmd):
            sys.stdout.write("%d\n"%pop())
        elif ("size" in cmd):
            sys.stdout.write("%d\n"%size())
        elif ("empty" in cmd):
            sys.stdout.write("%d\n"%empty())
        elif ("top" in cmd):
            sys.stdout.write("%d\n"%top())
        else :
            return -1
main()