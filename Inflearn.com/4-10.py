n=int(input())
a=list(map(int, input().split()))
a.insert(0, 0)
seq=[0]*(n+1)
for i in range(1, n+1):
    for j in range(1, n+1):
        if a[i]!=0 and seq[j]==0:
            a[i] -= 1
        elif a[i]==0 and seq[j]==0:
            seq[j] = i
            break
seq.pop(0)
for x in seq:
    print(x, end=' ')