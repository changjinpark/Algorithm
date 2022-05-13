import sys
from itertools import combinations

input = sys.stdin.readline

while True:
    A = list(map(int, input().split()))
    if A[0] == 0:
        break
    S = A[1:]
    C = list(combinations(S, 6))

    for i in C:
        for j in i:
            print(j, end=' ')
        print()
    print()
