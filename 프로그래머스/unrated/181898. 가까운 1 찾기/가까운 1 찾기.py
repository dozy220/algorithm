def solution(arr, idx):
    answer = -1
    
    for n in range(idx, len(arr)):
        if arr[n] == 1:
            answer = n
            break
    
    return answer