from collections import deque

n, m = map(int, input().split())
board = [list(map(int, input().split())) for _ in range(m)]

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

Q = deque()
for i in range(m):
    for j in range(n):
        if board[i][j] == 1:
            Q.append((i, j))

cnt = -1
while Q:
    for _ in range(len(Q)):
        tmp = Q.popleft()
        for i in range(4):
            x = tmp[0] + dx[i]
            y = tmp[1] + dy[i]
            if (0<=x<=m-1) and (0<=y<=n-1) and board[x][y] == 0:
                board[x][y] = 1
                Q.append((x,y))
    cnt += 1

for i in range(m):
    for j in range(n):
        if board[i][j] == 0:
            cnt = -1

print(cnt)
