def DFS(L):
    global cnt
    if L == (6,6):
        cnt += 1
    else:
        for i in range(4):
            x = L[0] + dx[i]
            y = L[1] + dy[i]
            if (0<=x<=6) and (0<=y<=6) and a[x][y] == 0:
                a[x][y] = 1
                DFS((x,y))
                a[x][y] = 0

if __name__ == "__main__":
    a = [list(map(int, input().split())) for _ in range(7)]
    dx = [-1, 0, 1, 0]
    dy = [0, 1, 0, -1]
    cnt = 0
    a[0][0] = 1
    DFS((0, 0))
    print(cnt)