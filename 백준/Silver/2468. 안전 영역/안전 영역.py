import sys
from collections import deque

input = sys.stdin.readline

def bfs(r, c, h):
    Q= deque()
    visited[r][c] = 2
    Q.append((r,c))

    while Q:
        cr, cc = Q.popleft()
        for x in range(4):
            nr = cr + dr[x]
            nc = cc + dc[x]
            if 0 <= nr < N and 0 <= nc < N:
                if A[nr][nc] >= h and visited[nr][nc] == 0:
                    visited[nr][nc] = 2
                    Q.append((nr, nc))

N = int(input())
A = [list(map(int, input().split())) for _ in range(N)]
#print(A)

max_h = -20**9
min_h = 20**9

for i in range(N):
    for j in range(N):
        max_h = max(max_h, A[i][j])
        min_h = min(min_h, A[i][j])
#print(max_h, min_h)

max_cnt = 0
dr = [0, 0, 1, -1]
dc = [1, -1, 0, 0]
for h in range(min_h, max_h+1):
    cnt = 0
    visited = [[0]*N for _ in range(N)]
    for i in range(N):
        for j in range(N):
            if A[i][j] >= h and visited[i][j] == 0:
                bfs(i, j, h)
                cnt += 1
    max_cnt = max(cnt, max_cnt)
print(max_cnt)