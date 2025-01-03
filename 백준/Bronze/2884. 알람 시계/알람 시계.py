h, m = map(int, input().split())

if 45 <= m:
    print(f"{h} {m-45}")
else:
    print(f"{23 if h == 0 else h-1} {m+15}")