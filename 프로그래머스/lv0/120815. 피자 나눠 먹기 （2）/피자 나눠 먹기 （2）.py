def solution(n):
    p = 1
    pi = 6
    while p*pi%n!=0:
        p += 1
    return p