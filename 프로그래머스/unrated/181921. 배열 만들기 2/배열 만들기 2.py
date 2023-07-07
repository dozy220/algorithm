def solution(l, r):
    answer = []

    for n in range(l, r+1):
        i = 0
        for ch in str(n):
            if (ch != '0' and ch != '5'): break
            i += 1
            if i == len(str(n)):
                answer.append(n)

    return [-1] if not answer else answer
