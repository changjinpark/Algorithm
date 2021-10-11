n = int(input())
body = []
for i in range(n):
    a, b = map(int, input().split())
    body.append((a,b))
body.sort(reverse=True)
wLargest = 0
cnt = 0
for h, w in body:
    if w > wLargest:
        wLargest = w
        cnt += 1
print(cnt)