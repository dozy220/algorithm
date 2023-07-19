def solution(arr):
    answer = []
    
    for i in range(len(arr)):
        if len(answer) != 0 and answer[len(answer)-1] == arr[i]:
            answer = answer[:len(answer)-1]
        else:
            answer.append(arr[i])
    
    return answer if answer else [-1]