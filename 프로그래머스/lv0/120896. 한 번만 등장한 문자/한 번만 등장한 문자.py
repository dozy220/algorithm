def solution(s):
    answer = []
    arr = list(s)
    
    for ch in arr:
        if arr.count(ch) == 1:
            answer.append(ch)
    
    answer.sort()

    return ''.join(answer)