def DFS(L, psum):
    global cnt
    if psum > t:
        return
    if L == k:
        if psum == t:
            cnt += 1
    else:
        for i in range(nv[L]+1):
            DFS(L+1, psum+(pv[L]*i))

if __name__ == "__main__":
    t = int(input())
    k = int(input())
    pv = list()
    nv = list()
    for i in range(k):
        a, b = map(int, input().split())
        pv.append(a)
        nv.append(b)
    cnt = 0
    DFS(0, 0)
    print(cnt)