from collections import deque

a = [list(map(int, input().split())) for _ in range(7)]
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
Q = deque()
Q.append((0,0))
a[0][0] = 1
dis = 0

while Q:
    if a[6][6] == 1: break
    for _ in range(len(Q)):
        tmp = Q.popleft()
        for i in range(4):
            x = tmp[0] + dx[i]
            y = tmp[1] + dy[i]
            if (0<=x<=6) and (0<=y<=6) and (a[x][y] == 0):
                a[x][y] = 1
                Q.append((x,y))
    dis+=1
else:
    dis = -1

print(dis)