def solution(strArr):
    answer = []
    for stri in strArr:
        if "ad" not in stri: answer.append(stri)
    return answer