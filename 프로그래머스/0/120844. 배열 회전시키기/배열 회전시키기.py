def solution(numbers, direction):

    d = 1
    if direction == 'right': d = len(numbers) -1
    
    return [numbers[(i+d)%len(numbers)] for i in range(len(numbers))]