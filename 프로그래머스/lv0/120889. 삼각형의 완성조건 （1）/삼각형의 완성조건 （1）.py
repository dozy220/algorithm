def solution(sides):
    answer = 0
    
    sides.sort()
    if sum(sides[0:2]) > sides[2]:
        answer = 1
    else:
        answer = 2
    
    return answer