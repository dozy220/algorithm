def solution(num_list):
    answer = 0
    
    if 10 < len(num_list):
        answer = sum(num_list)
    else:
        answer += 1
        for n in num_list:
            answer *= n
        
    return answer