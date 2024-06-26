def solution(dots):
    a = []
    b = []
    
    for d in dots:
        a.append(d[0])
        b.append(d[1])
            
    return abs(max(a) - min(a)) * (max(b) - min(b))