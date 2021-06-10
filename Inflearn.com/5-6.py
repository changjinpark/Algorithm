from collections import deque
n, m = map(int, input().split())
risk = list(map(int, input().split()))
Q = [(k, v) for (k, v) in enumerate(risk)]
Q = deque(Q)
cnt = 0
while Q:
    cur = Q.popleft()
    if any(cur[1] < q[1] for q in Q):
        Q.append(cur)
    else:
        cnt += 1
        if cur[0] == m:
            print(cnt)
            break




