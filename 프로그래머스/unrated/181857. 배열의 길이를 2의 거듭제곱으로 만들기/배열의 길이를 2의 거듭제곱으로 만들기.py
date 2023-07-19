def solution(arr):
    size = 1
    
    while size < len(arr):
        size *= 2
        
    if size != len(arr): 
        arr.extend([0] * (size - len(arr)))
    
    return arr