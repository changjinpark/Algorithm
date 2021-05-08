def DFS(L, score, time):
    global res
    if time > m: return
    if L == n:
        if score > res:
            res = score
    else:
        DFS(L+1, score + s[L], time + t[L])
        DFS(L+1, score, time)

if __name__ == "__main__":
    n, m = map(int, input().split())
    s = [0]*n
    t = [0]*n
    for i in range(n):
        s[i], t[i] = map(int, input().split())
    res = 0
    DFS(0, 0, 0)
    print(res)