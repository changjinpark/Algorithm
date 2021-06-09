from collections import deque
n, k = map(int, input().split())

Q = deque()

for i in range(1, n+1):
    Q.append(i)

while len(Q) != 1:
    for i in range(1, k):
        x = Q.popleft()
        Q.append(x)
    Q.popleft()

print(Q.popleft())
