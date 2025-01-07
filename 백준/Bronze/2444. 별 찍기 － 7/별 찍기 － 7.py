n = int(input())
s = 0

for i in range(n*2-1):
    if (i < n):
        print(' ' * (n-i-1) + '*' * (s+1))
    else:
        print(' ' * (i-n+1) + '*' * (s+1))
        
    if (i < n -1):
        s += 2
    else:
        s -= 2