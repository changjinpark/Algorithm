from collections import deque
n, m = map(int, input().split())
MAX = 10000
ch = [0] * (MAX+1)
dis = [0] * (MAX+1)

Q = deque()
Q.append(n)
ch[n] = 1

while Q:
    now = Q.popleft()
    if now == m: break
    for next in (now-1, now+1, now+5):
        if 1 <= next <= MAX:
            if ch[next] == 0:
                Q.append(next)
                ch[next] = 1
                dis[next] = dis[now] + 1

print(dis[now])