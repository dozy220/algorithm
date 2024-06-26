def solution(numer1, denom1, numer2, denom2):
    
    numer = numer1 * denom2 + numer2 * denom1
    denom = denom1 * denom2
    
    #n = max(n for n in range(1, min(numer, denom)) if numer%n==0 and denom %n==0)
    
    n = 2;
    while (n <= min(numer, denom)):
        if numer%n==0 and denom%n==0:
            numer /= n
            denom /= n
        else: n += 1
    
    return [numer, denom]