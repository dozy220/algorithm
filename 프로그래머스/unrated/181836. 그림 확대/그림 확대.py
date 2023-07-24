def solution(picture, k):
    answer = []
    
    for stri in picture:
        pic = ''
        for i in range(len(stri)):
            pic += stri[i] * k
            
        for j in range(k):
            answer.append(pic)
    
    return answer