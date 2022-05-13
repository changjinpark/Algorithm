import sys

input = sys.stdin.readline

def dfs(L, sum):
    if L == n:
        ans.add(sum)
        return
    dfs(L+1, sum+s[L])
    dfs(L+1, sum)

n = int(input())
s = list(map(int, input().split()))

ans = set()
dfs(0, 0)

ans = list(ans)
ans.sort()
for i in range(len(ans)):
    if i != ans[i]:
        print(i)
        break
else:
    print(ans[-1]+1)