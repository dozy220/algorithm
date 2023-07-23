def solution(a, b):
    answer = 0
    
    x = a%2
    y = b%2
    
    if x and y: answer = a*a + b*b
    elif x or y: answer = 2*(a+b)
    else: answer = abs(a-b)
      
    return answer