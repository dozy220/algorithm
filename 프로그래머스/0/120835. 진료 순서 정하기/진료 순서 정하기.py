def solution(emergency):
    answer = []
    sortEmer = sorted(emergency[:])
    sortEmer.reverse()
    
    for n in emergency:
        answer.append(sortEmer.index(n) + 1)
        
    return answer