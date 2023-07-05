def solution(num_list):
    answer = 0
    sum1 = 0
    mul = 1
    
    for i in num_list:
        sum1 += i
        mul *= i
            
    return 1 if mul < sum1**2 else 0