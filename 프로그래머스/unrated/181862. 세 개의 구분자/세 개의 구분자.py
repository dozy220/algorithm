def solution(myStr):
    answer = [s for s in myStr.replace('b', 'a').replace('c', 'a').split('a') if s]
    return answer if answer else ["EMPTY"]