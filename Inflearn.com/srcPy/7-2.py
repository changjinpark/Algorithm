def DFS(L, psum):
    global res
    if L == n+1:
        if psum > res:
            res = psum
        return
    else:
        if L+t[L-1] <= n+1: #n이 아니라 n+1
            DFS(L+t[L-1], psum+p[L-1])
        DFS(L+1, psum)

if __name__ == "__main__":
    n = int(input())
    t = list()
    p = list()
    for i in range(n):
        a, b = map(int, input().split())
        t.append(a)
        p.append(b)
    res = 0
    DFS(1, 0)
    print(res)