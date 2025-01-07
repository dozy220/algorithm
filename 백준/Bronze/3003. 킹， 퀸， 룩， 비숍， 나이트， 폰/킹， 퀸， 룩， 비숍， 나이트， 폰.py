c = [1, 1, 2, 2, 2, 8]
a = list(map(int, input().split()))

for i, n in enumerate(a):
    c[i] -= n
    
print(*c)