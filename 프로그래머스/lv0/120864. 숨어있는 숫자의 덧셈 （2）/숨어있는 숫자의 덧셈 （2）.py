import re

def solution(my_string):   
    return sum([int(si) for si in re.split(r'[a-zA-Z]', my_string) if si != ''])