def solution(array, n):
    answer = 0
    sub = 100
    array.sort()
    
    for i, x in enumerate(array):
        if abs(x-n) < sub or (abs(x-n) == sub and array[i] < answer):
            sub = abs(x-n)
            answer = x
            
    return answer