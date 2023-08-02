def solution(age):
    return ''.join(chr(int(ch)+97) for ch in str(age))