n = int(input())
a = list(map(int, input().split()))
m = max(a)

for i, j in enumerate(a) :
    a[i] = j/m*100

print(sum(a)/n)