def solution(n):
    answer = []
    answer.append(n)
    
    while(1):
        if n==1: break;
        if n%2: 
            n = n*3+1
            answer.append(n)
        else:
            n = n/2
            answer.append(n)
    
    return answer