def solution(myString, pat):
    return 1 if pat.replace('A', 'x').replace('B', 'A').replace('x', 'B') in myString else 0