from collections import deque

n = int(input())
board = [list(map(int, input().split())) for _ in range(n)]

b_max = -2147000000
b_min = 2147000000
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
res = list()
Q = deque()

for i in range(n):
    for j in range(n):
        if board[i][j] > b_max:
            b_max = board[i][j]
        if board[i][j] < b_min:
            b_min = board[i][j]

for k in range(b_min, b_max):
    cnt = 0
    ch = [[0] * n for _ in range(n)]
    for i in range(n):
        for j in range(n):
            if ch[i][j] == 0 and board[i][j] > k:
                Q.append((i, j))
                ch[i][j] = 1
                while Q:
                    tmp = Q.popleft()
                    for m in range(4):
                        x = tmp[0] + dx[m]
                        y = tmp[1] + dy[m]
                        if (0<=x<=n-1) and (0<=y<=n-1) and ch[x][y] == 0 and board[x][y] > k:
                            ch[x][y] = 1
                            Q.append((x,y))
                cnt += 1
    res.append(cnt)

print(max(res))


