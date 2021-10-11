import sys
def DFS(L, sum):
    global res
    if L > res:
        return
    if sum > m:
        return
    if sum == m:
        if L < res:
            res = L
    else:
        for i in range(0, n):
            DFS(L+1, sum+a[i])

if __name__ == "__main__":
    n = int(input())
    a = list(map(int, input().split()))
    m = int(input())
    a.sort(reverse=True)
    res = 2147000000
    DFS(0, 0)
    print(res)