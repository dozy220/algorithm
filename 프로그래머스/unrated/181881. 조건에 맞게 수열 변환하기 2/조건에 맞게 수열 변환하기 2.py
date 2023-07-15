def solution(arr):
    answer = -1
    
    while 1:
        pre = arr
        arr = [n/2 if 50 <= n and n%2==0 else n*2+1 if n < 50 and n%2==1 else n for n in pre]
        answer += 1
        if pre == arr: break
        
    return answer