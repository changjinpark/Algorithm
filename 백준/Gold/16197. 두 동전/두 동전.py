import sys
from collections import deque

input = sys.stdin.readline

def bfs():
    Q = deque()
    Q.append([coin[0][0], coin[0][1], coin[1][0], coin[1][1], 0])
    visited[coin[0][0]][coin[0][1]][coin[1][0]][coin[1][1]] = 1

    while Q:
        r1, c1, r2, c2, cnt = Q.popleft()
        if cnt >= 10:
            return -1

        for i in range(4):
            nr1 = r1 + dr[i]
            nc1 = c1 + dc[i]
            nr2 = r2 + dr[i]
            nc2 = c2 + dc[i]
            if 0 <= nr1 < n and 0 <= nc1 < m and 0 <= nr2 < n and 0 <= nc2 < m:
                if visited[nr1][nc1][nr2][nc2] == 0:
                    if board[nr1][nc1] == '#':
                        nr1, nc1 = r1, c1
                    if board[nr2][nc2] == '#':
                        nr2, nc2 = r2, c2
                    Q.append([nr1, nc1, nr2, nc2, cnt + 1])
                    visited[nr1][nc1][nr2][nc2] = 1
            elif 0 <= nr1 < n and 0 <= nc1 < m:
                return cnt+1
            elif 0 <= nr2 < n and 0 <= nc2 < m:
                return cnt+1
            else:
                continue

n, m = map(int, input().split())
board = [list(map(str, input().strip())) for _ in range(n)]
coin = []
visited = [[[[0 for _ in range(m)] for _ in range(n)] for _ in range(m)] for _ in range(n)]
dr = [0, 0, 1, -1]
dc = [1, -1, 0, 0]

for i in range(n):
    for j in range(m):
        if board[i][j] == 'o':
            coin.append([i, j])

print(bfs())

