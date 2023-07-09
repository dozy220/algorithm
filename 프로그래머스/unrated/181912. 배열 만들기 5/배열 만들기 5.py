def solution(intStrs, k, s, l):
    answer = []
    
    for str in intStrs:
        if k < int(str[s:s+l]):
            answer.append(int(str[s:s+l]))
            
    return [int(str[s:s+l]) for str in intStrs if k < int(str[s:s+l])]