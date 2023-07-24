def solution(order):
    answer = 0
    
    for stri in order:
        if 'americano' in stri:
            answer += 4500
        elif 'cafelatte' in stri:
            answer += 5000
        else:
            answer += 4500
    
    return answer