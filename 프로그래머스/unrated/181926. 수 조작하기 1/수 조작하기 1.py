def solution(n, control):
    answer = n
    
    for ch in control:
        if ch == 'w':
            answer += 1
        elif ch == 's':
            answer -= 1
        elif ch == 'd':
            answer += 10
        else:
            answer -= 10
    
    return answer