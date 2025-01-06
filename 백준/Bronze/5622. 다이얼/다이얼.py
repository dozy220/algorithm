s = list(str(input()))
n = 0

for c in s:
    n += (ord(c) - ord('A') + 9) // 3
    if c == 'S' or c == 'V' or c == 'Y' or c == 'Z':
        n -= 1

print(n)