import sys
def DFS(L):
    global switch
    if switch == 1: return
    if L[0] == 0:
        print(L[1])
        switch = 1
    else:
        for i in range(3):
            x = L[0] + dx[i]
            y = L[1] + dy[i]
            if (0<=x<=9) and (0<=y<=9) and board[x][y] == 1:
                board[x][y] = 0
                DFS((x,y))

if __name__ == "__main__":
    switch = 0
    board = [list(map(int, input().split())) for _ in range(10)]
    dx = [0, 0, -1]
    dy = [-1, 1, 0]
    for i in range(10):
        if board[9][i] == 2:
            #board[9][i] = 0
            DFS((9,i))