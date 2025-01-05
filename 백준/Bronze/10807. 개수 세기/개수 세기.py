import sys

c = int(sys.stdin.readline())
s = list(map(int, sys.stdin.readline().split()))
n = int(sys.stdin.readline())

print(list.count(s, n))