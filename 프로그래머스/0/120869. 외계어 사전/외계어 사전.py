def solution(spell, dic):
    answer = 2
    
    s = ''.join(sorted(spell))
    
    for di in dic:
        if s == ''.join(sorted(di)):
            answer = 1
            break
        
    return answer