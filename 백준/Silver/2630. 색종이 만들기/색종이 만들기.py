import sys
input = sys.stdin.readline

def solution(N, r, c):
    global white, blue
    color = A[r][c]
    for i in range(r, r+N):
        for j in range(c, c+N):
            if color != A[i][j]:
                solution(N//2, r, c)
                solution(N//2, r+N//2, c)
                solution(N//2, r, c+N//2)
                solution(N//2, r+N//2, c+N//2)
                return
    if color == 0:
        white += 1
    else:
        blue += 1

N = int(input())
A = [list(map(int, input().split())) for _ in range(N)]
#print(A)

white = 0
blue = 0
solution(N, 0, 0)#색종이 크기, r, c

print(white)
print(blue)