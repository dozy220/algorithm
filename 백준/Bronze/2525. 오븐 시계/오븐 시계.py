h, m = map(int, input().split())
x  = int(input())

print(f"{h-24 if 23 < (h := h + (m+x)//60) else h} {(m+x)%60}")