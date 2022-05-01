import sys

input = sys.stdin.readline

def dfs(L, total, plus, minus, multi, divide):
    global max_res, min_res
    if L == N-1:
        max_res= max(max_res, total)
        min_res= min(min_res, total)
        return
    if plus > 0:
        dfs(L+1, total+num[L+1], plus-1, minus, multi, divide)
    if minus > 0:
        dfs(L+1, total-num[L+1], plus, minus-1, multi, divide)
    if multi > 0:
        dfs(L+1, total*num[L+1], plus, minus, multi-1, divide)
    if divide > 0:
        dfs(L+1, int(total/num[L+1]), plus, minus, multi, divide-1)

N = int(input())
num = list(map(int, input().split()))
op_num = list(map(int, input().split()))
max_res = -1e9
min_res = 1e9
dfs(0, num[0], op_num[0], op_num[1], op_num[2], op_num[3])
print(max_res)
print(min_res)