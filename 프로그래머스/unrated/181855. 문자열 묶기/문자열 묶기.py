def solution(strArr):
    a = [0]*31
    for s in strArr:
        a[len(s)]+=1
    return max(a)
                