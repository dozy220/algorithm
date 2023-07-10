def solution(my_string, m, c):
    return ''.join([str(my_string[n]) for n in range(len(my_string)) if n%m == c-1])