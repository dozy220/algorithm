n = int(input())
sum = sum(range(n+1))
pow = 0

for i in range(n+1):
    pow += i * i * i

print(sum)
print(sum * sum)
print(pow)