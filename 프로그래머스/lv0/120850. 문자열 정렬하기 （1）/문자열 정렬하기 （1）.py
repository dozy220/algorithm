import re

def solution(my_string):
    return sorted([int(i) for i in re.sub('[a-z]', '', my_string)])