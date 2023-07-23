def solution(str_list, ex):
    answer = ''
    for stri in str_list:
        if ex not in stri:
            answer += stri
    return answer