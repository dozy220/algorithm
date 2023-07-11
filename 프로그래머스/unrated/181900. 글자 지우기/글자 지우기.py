def solution(my_string, indices):
    answer = ''
    for n in range(len(my_string)):
        if n not in indices:
            answer += my_string[n]
    return answer