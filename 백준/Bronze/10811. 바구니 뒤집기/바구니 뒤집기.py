import sys

s, c = map(int, input().split())
n = [list(map(int, sys.stdin.readline().split())) for i in range(c)]
b = [i+1 for i in range(s)]

for i in range(c):
    r = b[n[i][0]-1:n[i][1]]
    r.reverse()    
    b[n[i][0]-1:n[i][1]] = r

print(*b)