def solution(n):
    answer = [[0]*n for i in range(n)] #[[None for j in range(n)] for i in range(n)] #[[0]*n]*n ?
    
    move = [[0,1], [1,0], [0,-1], [-1,0]]
    x, y, m = 0, 0, 0
    
    for i in range(1, n*n+1):
        answer[y][x] = i
        
        if y + move[m][0] >= n or x + move[m][1] >= n or answer[y + move[m][0]][x + move[m][1]]:
            m = (m+1)% len(move)
        
        y = y + move[m][0]
        x = x + move[m][1]
    
    return answer