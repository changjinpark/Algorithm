from sys import stdin
from collections import deque


def Input_Data():
    readl = stdin.readline
    N, M = map(int, readl().split())
    data = [list(map(str, readl().strip())) for _ in range(N)]
    return N, M, data

def bfs(r, c, k):
    global cnt
    Q = deque()
    Q.append((r, c))
    visited[r][c] = k

    direction = {'U': (-1, 0), 'D': (1, 0), 'L': (0, -1), 'R': (0, 1)}
    while Q:
        cr, cc = Q.popleft()
        dr, dc = direction[data[cr][cc]]
        nr = cr + dr
        nc = cc + dc

        if 0 <= nr < N and 0 <= nc < M:
            if visited[nr][nc] == 0:
                visited[nr][nc] = k
                Q.append((nr, nc))
            elif visited[nr][nc] == k:
                cnt += 1
                return
            elif visited[nr][nc] < k:
                return

def Solve():
    k = 0
    for r in range(N):
        for c in range(M):
            if visited[r][c] == 0:
                k += 1
                bfs(r, c, k)
                #print(visited)

N, M, data = Input_Data()
visited = [[0] * M for _ in range(N)]
cnt = 0
Solve()
print(cnt)