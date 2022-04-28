import sys

input = sys.stdin.readline
n = int(input())
board = [[0]*101 for _ in range(101)]

for _ in range(n):
    x1, y1 = map(int, input().split())
    for x in range(x1, x1+10):
        for y in range(y1, y1+10):
            board[x][y] = 1

dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]
l = 0
for x in range(101):
    for y in range(101):
        if board[x][y] == 1:
            for i in range(4):
                nx = x + dx[i]
                ny = y + dy[i]
                if board[nx][ny] == 0:
                    l += 1
print(l)

