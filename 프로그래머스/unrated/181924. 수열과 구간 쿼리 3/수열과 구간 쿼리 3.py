def solution(arr, queries):
    answer = arr
    tmp = 0
    
    for a, b in queries:        
        tmp = answer[a]
        answer[a] = answer[b]
        answer[b] = tmp
    
    return answer