import sys

input = sys.stdin.readline
n = int(input())
board = [[0]*101 for _ in range(101)]

for _ in range(n):
    x1, y1 = map(int, input().split())
    for x in range(x1, x1+10):
        for y in range(y1, y1+10):
            board[x][y] = 1

area = 0
for x in range(101):
    for y in range(101):
        area += board[x][y]
print(area)

