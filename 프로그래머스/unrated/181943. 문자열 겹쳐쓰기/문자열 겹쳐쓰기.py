def solution(my_string, overwrite_string, s):
    result = my_string[:s] + overwrite_string   
    
    if len(my_string[s:]) >= len(overwrite_string):
        result = result + my_string[len(result):]
        
    return result