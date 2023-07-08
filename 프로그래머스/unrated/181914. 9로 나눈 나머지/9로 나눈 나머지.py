def solution(number):
    return sum([int(ch)%9 for ch in number]) % 9