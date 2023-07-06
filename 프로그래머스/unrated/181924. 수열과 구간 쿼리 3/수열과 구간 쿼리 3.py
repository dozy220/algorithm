def solution(arr, queries):
    answer = arr
    tmp = 0
    
    for ar in queries:
        x = ar[0]
        y = ar[1]
        
        tmp = answer[x]
        answer[x] = answer[y]
        answer[y] = tmp
    
    return answer