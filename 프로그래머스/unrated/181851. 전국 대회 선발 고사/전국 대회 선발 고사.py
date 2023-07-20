def solution(rank, attendance):
    answer = 0
    arr = [];
    
    for i, r in enumerate(rank):
        if attendance[i]:
            arr.append((r, i))
            
    arr = sorted(arr)[:3]
        
    return arr[0][1] * 10000 + arr[1][1] * 100 + arr[2][1]