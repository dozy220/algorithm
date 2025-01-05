import sys

i = int(sys.stdin.readline())
n = list(map(int, sys.stdin.readline().split()))

n.sort()
print(n[0], n[-1])  