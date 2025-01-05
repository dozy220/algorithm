sum = int(input())
cnt = int(input())
tmp = 0

for i in range (cnt):
    pro, pri = map(int, input().split())
    tmp += pro * pri
    
print("Yes") if sum == tmp else print("No")