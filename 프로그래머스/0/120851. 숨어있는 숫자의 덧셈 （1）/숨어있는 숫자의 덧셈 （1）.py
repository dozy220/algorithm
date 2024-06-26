import re

def solution(my_string):
    return eval('+'.join(re.sub('[a-zA-Z]', '', my_string)))