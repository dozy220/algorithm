def solution(my_string):
    return my_string.strip().replace("\\s+", " ").split()