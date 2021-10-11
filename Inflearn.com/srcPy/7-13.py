from collections import deque
n = int(input())
a = [list(map(int, input().split())) for _ in range(n)]

dx = [-1,-1,-1,0,1,1,1,0]
dy = [-1,0,1,1,1,0,-1,-1]
cnt = 0
Q = deque()

for i in range(n):
    for j in range(n):
        if a[i][j] == 1:
            a[i][j] = 0
            Q.append((i,j))
            while Q:
                tmp = Q.popleft()
                for k in range(8):
                    x = tmp[0] + dx[k]
                    y = tmp[1] + dy[k]
                    if (0<=x<=n-1) and (0<=y<=n-1) and a[x][y] == 1:
                        a[x][y] = 0
                        Q.append((x,y))
            cnt+=1

print(cnt)