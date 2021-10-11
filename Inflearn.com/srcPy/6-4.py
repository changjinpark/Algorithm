import sys

def DFS(L, sum):
    if L == n:
        if(total - sum == sum):
            print("YES")
            sys.exit(0)
    else:
        DFS(L+1, sum + M[L])
        DFS(L+1, sum)

if __name__=="__main__":
    n = int(input())
    M = list(map(int, input().split()))
    total = sum(M)
    DFS(0, 0)
    print("NO")
