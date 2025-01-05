import sys

b, c = map(int, input().split())
n = [list(map(int, sys.stdin.readline().split())) for i in range(c)]
s = [0 for i in range(b)]

for i in n:
    for j in range(i[0]-1, i[1]):
        s[j] = i[2]

print(*s)