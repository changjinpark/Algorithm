import sys

input = sys.stdin.readline
n = int(input())
max_h = -1
max_h_idx = -1
end_l = -1
A = []
for _ in range(n):
    l, h = map(int, input().split())
    A.append((l, h))
    if h > max_h:
        max_h = h
        max_h_idx = l
    if l > end_l:
        end_l = l

x = [0] * (end_l+1)
for a in A:
    x[a[0]] = a[1]

area = 0
tmp = x[0]
for i in range(0, max_h_idx+1):
    if x[i] > tmp:
        tmp = x[i]
    area += tmp
tmp = x[end_l]
for i in range(end_l, max_h_idx, -1):
    if x[i] > tmp:
        tmp = x[i]
    area += tmp
print(area)