a, b, c = map(int, input().split())

if a == b and b == c:
    print(10_000 + (a * 1000))
else:
    if a == b or b == c or a == c:
        print(1_000 + (a if a == b else c) * 100)
    else:
        print((max(a, c) if a > b else max(b, c)) * 100)