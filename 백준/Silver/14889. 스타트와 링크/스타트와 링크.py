import sys
from itertools import combinations
input = sys.stdin.readline

N = int(input())
S = [list(map(int, input().split())) for _ in range(N)]
#print(S)

num = [i for i in range(N)]
team = list(combinations(num, N//2))
#print(team)

min_diff = 20**9
for k in range(len(team)//2):
    teamA = team[k]
    start = 0
    for i in range(len(teamA)):
        for j in range(len(teamA)):
            start += S[teamA[i]][teamA[j]]
    #print(teamA, start)

    teamB = team[-1-k]
    link = 0
    for i in range(len(teamB)):
        for j in range(len(teamB)):
            link += S[teamB[i]][teamB[j]]
    #print(teamB, link)
    min_diff = min(min_diff, abs(start-link))

print(min_diff)