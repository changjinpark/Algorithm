import sys

input = sys.stdin.readline
n = int(input())

#666부터 하나씩 증가시킨다. 666을 포함하는지 판단
num = 666
cnt = 0
while True:
    if '666' in str(num):
        cnt += 1
    if cnt == n:
        print(num)
        break
    num += 1
