def solution(my_string):
    return sorted([my_string[n:] for n in range(len(my_string))])