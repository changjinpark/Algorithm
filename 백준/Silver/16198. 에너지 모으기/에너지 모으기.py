import sys

input = sys.stdin.readline

def dfs(sum, n):
    global maxRes
    if len(w) == 2:
        maxRes = max(maxRes, sum)
        return
    for i in range(1, n-1):
        psum = w[i-1]*w[i+1]
        tmp = w[i]
        del w[i]

        dfs(sum + psum, n-1)
        w.insert(i, tmp)

n = int(input())
w = list(map(int, input().split()))
maxRes = -1
dfs(0, n)
print(maxRes)