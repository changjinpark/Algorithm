def DFS(L):
    global cnt
    cnt += 1
    board[L[0]][L[1]] = 0
    for i in range(4):
        x = L[0] + dx[i]
        y = L[1] + dy[i]
        if (0<=x<=n-1) and (0<=y<=n-1) and board[x][y] == 1:
            DFS((x,y))


if __name__ == "__main__":
    n = int(input())
    board = [list(map(int, input())) for _ in range(n)]
    dx = [-1,0,1,0]
    dy = [0,1,0,-1]
    res = list()
    cnt = 0
    for i in range(n):
        for j in range(n):
            if board[i][j] == 1:
                DFS((i,j))
                res.append(cnt)
                cnt = 0
    print(len(res))
    res.sort()
    for x in res:
        print(x)