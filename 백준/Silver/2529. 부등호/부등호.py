import sys
input = sys.stdin.readline

def check(a, b, c):
    #print(a,b,c)
    if b == '<':
        return a<c
    else:
        return a>c

def dfs(L, s):
    global min_res, max_res
    if L == k+1:
        if len(min_res) == 0:
            min_res = s
        else:
            max_res = s
        return
    for i in range(10):
        #print(visited)
        #print(s)
        if visited[i] == 1: continue
        if L == 0 or (check(s[-1], A[L-1], str(i))):
            visited[i] = 1
            dfs(L+1, s+str(i))
            visited[i] = 0


k = int(input())
A = list(map(str, input().split()))
visited = [0]*10
max_res = ''
min_res = ''

dfs(0, '')
print(max_res)
print(min_res)


