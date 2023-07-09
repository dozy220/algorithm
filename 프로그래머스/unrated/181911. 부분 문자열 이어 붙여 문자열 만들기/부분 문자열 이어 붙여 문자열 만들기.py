def solution(my_strings, parts):
    return ''.join([my_strings[n][parts[n][0]:parts[n][1]+1] for n in range(len(my_strings))])