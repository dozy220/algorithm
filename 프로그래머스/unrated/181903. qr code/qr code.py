def solution(q, r, code):
    
    return ''.join(code[n] for n in range(r, len(code), q))