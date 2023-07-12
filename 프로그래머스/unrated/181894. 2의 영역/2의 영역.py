def solution(arr):
    size = [n for n in range(len(arr)) if arr[n] == 2]
    return [-1] if len(size) == 0 else arr[size[0]:size[len(size)-1]+1]
    