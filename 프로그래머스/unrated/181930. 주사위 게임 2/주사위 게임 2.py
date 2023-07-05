def solution(a, b, c):
    answer = a + b + c
    
    if a==b and b==c:
        answer = answer * a*a*3 * a*a*a*3
    elif a==b or b==c or a==c:
        answer *= (a*a + b*b + c*c)
    
    return answer