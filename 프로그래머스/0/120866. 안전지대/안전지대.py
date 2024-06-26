def solution(board):
    answer = 0
    
    for i, w in enumerate(board):
        for j, h in enumerate(w):
            if board[i][j] == 0:
                if i > 0:
                    if j > 0:
                        if board[i-1][j-1] == 1: continue
                    if board[i-1][j] == 1: continue
                    if j < len(board)-1:
                        if board[i-1][j+1] == 1: continue
                if j > 0:
                    if board[i][j-1] == 1: continue
                if j < len(board)-1:
                    if board[i][j+1] == 1: continue

                if i < len(board)-1:
                    if j > 0:
                        if board[i+1][j-1] == 1: continue
                    if board[i+1][j] == 1: continue
                    if j < len(board)-1:
                        if board[i+1][j+1] == 1: continue
                answer += 1
    
    return answer