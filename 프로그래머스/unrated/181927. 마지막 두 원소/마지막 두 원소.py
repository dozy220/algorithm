def solution(num_list):
    answer = num_list
    last = num_list[len(num_list) - 1]
    a = num_list[len(num_list) - 2]
    
    if a < last:
        answer.append(last - a)
    else:
        answer.append(last * 2)
    
    return answer
