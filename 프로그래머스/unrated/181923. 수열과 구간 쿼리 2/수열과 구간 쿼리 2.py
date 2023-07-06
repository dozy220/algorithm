def solution(arr, queries):
    answer = []

    for s, e, k in queries:
        tmp = []
        for n in arr[s:e+1]:
            if k < n:
                tmp.append(n)
        
        answer.append(-1 if not tmp else min(tmp))
        
    return answer