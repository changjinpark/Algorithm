import sys
from collections import deque

input = sys.stdin.readline
N = int(input())
a, b = map(int, input().split())
m = int(input())
A = [[0]*(N+1) for _ in range(N+1)]
for _ in range(m):
    x, y = map(int, input().split())
    A[x][y] = A[y][x] = 1
#print(A)

Q = deque()
Q.append((b, 0))
visited = []
visited.append(b)

while Q:
    cur, cnt = Q.popleft()
    if cur == a:
        print(cnt)
        break
    for c in range(1, N+1):
        if A[cur][c] == 1 and c not in visited:
            Q.append((c, cnt+1))
            visited.append(c)
else:
    print(-1)
