import sys

a, x = map(int, sys.stdin.readline().split())
n = list(map(int, sys.stdin.readline().split()))

print(*[i for i in n if i < x]) 