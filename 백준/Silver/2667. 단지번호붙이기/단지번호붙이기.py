import sys
from collections import deque
read = sys.stdin.readline

def BFS(r, c):
	visited[r][c] = 1
	Q = deque()
	Q.append([r, c])
	home = 0
	while Q:
		cur_r, cur_c = Q.popleft()
		home += 1
		for i in range(4):
			nr = cur_r + dr[i]
			nc = cur_c + dc[i]
			if 0 <= nr < N and 0 <= nc < N and board[nr][nc] == 1 and visited[nr][nc] == 0:
				visited[nr][nc] = 1
				Q.append([nr, nc])
	ans.append(home)

N = int(read())
board = [list(map(int, read().strip())) for _ in range(N)]
visited = [[0]*N for _ in range(N)]
dr = [0, 0, 1, -1]
dc = [1, -1, 0, 0]
cnt = 0
ans = []
for i in range(N):
	for j in range(N):
		if board[i][j] == 1 and visited[i][j] == 0:
			BFS(i, j)
			cnt += 1

ans.sort()
print(cnt)
for x in ans:
	print(x)