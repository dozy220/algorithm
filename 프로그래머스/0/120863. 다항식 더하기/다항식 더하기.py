def solution(polynomial):
    answer = ''
    x = 0
    i = 0
    
    for a in polynomial.split(' + '):
        if 'x' in a:
            if len(a) == 1:
                x += 1
            else:
                x += int(a[:len(a)-1])
        else:
            i += int(a)
    
    if x > 1 and i > 1:
        answer = str(x) + 'x + ' + str(i)
    elif x > 1 and i == 0:
        answer = str(x) + 'x'
    elif x == 1 and i != 0:
        answer = 'x + ' + str(i)
    elif x == 1:
        answer = 'x'
    elif i != 0:
        answer = str(i)
    
    return answer