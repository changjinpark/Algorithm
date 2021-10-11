def DFS(L, val):
    global cnt
    if val == a_max:
        cnt+=1
    else:
        for i in range(4):
            x = L[0] + dx[i]
            y = L[1] + dy[i]
            if (0<=x<=n-1) and (0<=y<=n-1) and (a[x][y] > val) and ch[x][y] == 0:
                ch[x][y] = 1
                DFS((x,y), a[x][y])
                ch[x][y] = 0

if __name__ == "__main__":
    n = int(input())
    a = [list(map(int, input().split())) for _ in range(n)]
    ch = [[0]*n for _ in range(n)]
    dx = [-1, 0, 1, 0]
    dy = [0, 1, 0, -1]
    cnt = 0
    a_min = 2147000000
    a_max = -2147000000
    for i in range(len(a)):
        for j in range(len(a[i])):
            if a_max < a[i][j]:
                a_max = a[i][j]
                a_max_p = (i,j)
            if a_min > a[i][j]:
                a_min = a[i][j]
                a_min_p = (i,j)

    ch[a_min_p[0]][a_min_p[1]] = 1
    DFS(a_min_p, a_min)
    print(cnt)