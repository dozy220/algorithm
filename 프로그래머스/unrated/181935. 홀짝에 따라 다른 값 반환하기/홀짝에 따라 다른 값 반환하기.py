def solution(n):
    answer = 0
    if n%2==1:
        for n in range(n%2,n+1,2):
            answer += n
    else :
        for n in range(n%2,n+1,2):
            answer += n*n
    return answer