import sys

c = int(input())
s = [list(sys.stdin.readline().split()) for i in range(c)]

for [n, w] in s:
    a = ""
    for i in w:
        a += i * int(n)
    print(a) 