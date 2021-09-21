n = int(input())
meeting = []
for i in range(n):
    s, e = map(int, input().split())
    meeting.append((s,e))
meeting.sort(key = lambda x : (x[1], x[0]))
endTime = 0
cnt = 0
for s, e in meeting:
    if s >= endTime:
        endTime = e
        cnt += 1
print(cnt)