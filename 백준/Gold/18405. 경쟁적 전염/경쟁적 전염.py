import sys
from collections import deque

input = sys.stdin.readline
N, K = map(int, input().split())
A = [list(map(int, input().split())) for _ in range(N)]
S, X, Y = map(int, input().split())
#print(A)
virus = []
for i in range(N):
    for j in range(N):
        if A[i][j] != 0:
            virus.append((A[i][j], i, j, 0))

#print(virus)
virus.sort()
Q = deque(virus)
dr = [0, 0, 1, -1]
dc = [1, -1, 0, 0]

while Q:
    for _ in range(len(Q)):
        cur_virus, cur_r, cur_c, cur_t = Q.popleft()
        if cur_t == S:
            break
        for i in range(4):
            nr = cur_r + dr[i]
            nc = cur_c + dc[i]
            if 0 <= nr < N and 0 <= nc < N and A[nr][nc] == 0:
                A[nr][nc] = cur_virus
                Q.append((cur_virus, nr, nc, cur_t+1))

print(A[X-1][Y-1])

