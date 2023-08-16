def solution(quiz):
    answer = []
    
    for st in quiz:
        if eval(st.replace('=', '==')): answer.append('O')
        else: answer.append('X')
        
    return answer