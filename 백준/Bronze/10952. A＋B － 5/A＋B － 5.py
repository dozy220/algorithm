import sys

a = []

while True:
    x, y = map(int, sys.stdin.readline().split())
    
    if x == 0 and y == 0:
        break
    else: 
        a.append(x+y)
        
for i in a:
    print(i)