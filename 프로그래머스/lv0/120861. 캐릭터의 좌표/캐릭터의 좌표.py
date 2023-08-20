def solution(keyinput, board):
    answer = [0, 0]
    w = (board[0]-1)//2
    h = (board[1]-1)//2
        
    for key in keyinput:
        if key == 'up' and answer[1] < h:
            answer[1] += 1                
        if key == 'down' and answer[1] > -h:
            answer[1] -= 1                
        if key == 'left' and answer[0] > -w:
            answer[0] -= 1
        if key == 'right' and answer[0] < w:
            answer[0] += 1
            
    return answer