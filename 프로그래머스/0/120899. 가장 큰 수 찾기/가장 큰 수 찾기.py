def solution(array):
    answer = [0, 0]
    
    for i, n in enumerate(array):
        if n > answer[0]:
            answer = [n, i]
    
    return answer