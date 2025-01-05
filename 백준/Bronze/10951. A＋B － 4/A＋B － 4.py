import sys

a = []

while True:
    line = sys.stdin.readline()
    if not line:
        break
    else:
        x, y = map(int, line.split())
        a.append(x+y)
        
for i in a:
    print(i)