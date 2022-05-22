import sys

input = sys.stdin.readline

def dfs(r, c, idx, total):
    global ans
    if ans > total + max_value * (3-idx):
        return
    if idx == 3:
        ans = max(total, ans)
        return
    else:
        for i in range(4):
            nr, nc = r+dr[i], c+dc[i]
            if 0 <= nr < n and 0 <= nc < m and not visited[nr][nc]:
                if idx == 1:
                    visited[nr][nc] = True
                    dfs(r, c, idx+1, total + board[nr][nc])
                    visited[nr][nc] = False
                visited[nr][nc] = True
                dfs(nr, nc, idx+1, total+board[nr][nc])
                visited[nr][nc] = False

n, m = list(map(int, input().split()))
board = [list(map(int, input().split())) for _ in range(n)]
visited = [[False]*m for _ in range(n)]
dr = [0, 0, 1, -1]
dc = [1, -1, 0, 0]
max_value = max(map(max, board))
ans = -1
for i in range(n):
    for j in range(m):
        visited[i][j] = True
        dfs(i, j, 0, board[i][j])
        visited[i][j] = False

print(ans)
