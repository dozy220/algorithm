def solution(rsp):
    answer = ''
    
    for strRsp in rsp:
        if strRsp == "2": answer += "0"
        if strRsp == "0": answer += "5"
        if strRsp == "5": answer += "2"
        
    return answer