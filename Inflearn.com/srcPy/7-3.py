def DFS(L, sum):
    global res
    if L == n:
        if 0 < sum <= ksum:
            res.add(sum)
    else:
        DFS(L+1, sum+k[L])
        DFS(L+1, sum-k[L])
        DFS(L+1, sum)

if __name__ == "__main__":
    n = int(input())
    k = list(map(int, input().split()))
    ksum = sum(k)
    res = set()
    DFS(0, 0)
    print(ksum-len(res))