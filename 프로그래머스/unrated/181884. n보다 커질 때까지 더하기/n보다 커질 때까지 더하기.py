def solution(numbers, n):
    answer = 0
    for x in numbers:
        answer += x
        if n < answer: break
    return answer