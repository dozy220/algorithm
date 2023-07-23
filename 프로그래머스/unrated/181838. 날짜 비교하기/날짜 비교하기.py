def solution(date1, date2):
    answer = 0
    year = date1[0] <= date2[0]
    
    if year and date1[1] < date2[1]: answer = 1
    elif year and date1[1] == date2[1]:
        if date1[2] < date2[2]: answer = 1
    
    return answer