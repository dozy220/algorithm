import sys

a = int(input())
b = []

for i in range(a):
    x, y = map(int, sys.stdin.readline().split())
    b.append([x, y])
    
for i in range(a):
    print(f"Case #{i+1}: {b[i][0]} + {b[i][1]} = {b[i][0] + b[i][1]}")