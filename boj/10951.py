import sys
for line in sys.stdin:
    a, b = map(int, line.rstrip().split())
    sys.stdout.write("%d\n"%(a+b))