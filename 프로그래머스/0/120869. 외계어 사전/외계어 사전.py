def solution(spell, dic):
    answer = 2
    s = sorted(spell)
    
    for di in dic:
        if s == sorted(di):
            answer = 1
            break 
        
    return answer