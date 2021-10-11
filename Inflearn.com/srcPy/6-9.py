import sys
def DFS(L, sum):
    if (L == n) and sum == f:
        for i in range(n):
            print(p[i], end=' ')
        sys.exit(0)
    else:
        for i in range(1, n+1):
            if ch[i] == 0:
                ch[i] = 1
                p[L] = i
                DFS(L+1, sum + p[L]*b[L])
                ch[i] = 0

if __name__=="__main__":
    n, f = map(int, input().split())
    p = [0]*n
    b = [1]*n
    ch = [0] * (n+1)
    for i in range(1, n):
        b[i] = b[i-1]*(n-i) // i
    DFS(0, 0)