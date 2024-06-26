def solution(hp):
    answer = 0
    
    for ant in range(5, 0, -2):
        answer += hp//ant
        hp = hp%ant
    
    return answer