import sys
from collections import deque

input = sys.stdin.readline
N = int(input())
a, b = map(int, input().split())
m = int(input())
graph = [[] for _ in range(N+1)]
for _ in range(m):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)

#print(graph)
check = [0] * (N+1)

Q = deque()
Q.append((a, 0))
check[a] = 1

while Q:
    node, cnt = Q.popleft()
    if node == b:
        print(cnt)
        break
    for i in graph[node]:
        if check[i] == 0:
            check[i] = 1
            Q.append((i, cnt+1))
else:
    print(-1)
