s = list(str(input()).upper())
m = {}
a, b = 'A', 0

for c in s:
    if c not in m:  
        m[c] = 1
    else:
        m[c] += 1
        
    if m[c] > b:
        a = c
        b = m[c]
    elif m[c] == b:
        a = '?'
        
print(a)