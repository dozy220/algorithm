def solution(numbers):
    
    num = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    
    for i, ch in enumerate(num):
        numbers = numbers.replace(ch, str(i))
    
    return int(numbers)