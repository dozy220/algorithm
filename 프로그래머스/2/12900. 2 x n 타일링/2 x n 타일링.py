def solution(n):
    tiling = [1, 2, 3]
    
    if n < 4:
        return tiling[n-1]
    
    for i in range(3, n):
        next_tiling = (tiling[-1] + tiling[-2]) % 1_000_000_007
        tiling.append(next_tiling)
    
    return tiling[-1]
