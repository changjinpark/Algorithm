import sys
from collections import deque

input = sys.stdin.readline

def bfs(r, c):
    Q = deque()
    Q.append((r, c))
    visited[r][c] = 1

    while Q:
        cr, cc = Q.popleft()
        for i in range(8):
            nr = cr + dr[i]
            nc = cc + dc[i]
            if 0 <= nr < h and 0 <= nc < w:
                if visited[nr][nc] == 0 and board[nr][nc] == 1:
                    visited[nr][nc] = 1
                    Q.append((nr, nc))

dr = [0, 0, 1, -1, 1, -1, 1, -1]
dc = [1, -1, 0, 0, 1, 1, -1, -1]

while True:
    w, h = map(int, input().split())
    if w == 0 and h == 0:
        break
    board = [list(map(int, input().split())) for _ in range(h)]
    visited = [[0]*w for _ in range(h)]
    #print(board)

    cnt = 0
    for r in range(h):
        for c in range(w):
            if visited[r][c] == 0 and board[r][c] == 1:
                bfs(r, c)
                cnt += 1
                #print(visited)
    print(cnt)