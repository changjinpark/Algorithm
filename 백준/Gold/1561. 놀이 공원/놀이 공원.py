import sys

input = sys.stdin.readline
n, m = map(int, input().split()) #아이들 수, 놀이기구 수
T = list(map(int, input().split()))

if n <= m:
	print(n)
else:
	#아이들을 전부 태우기 위해 소요되는 시간을 이분 탐색으로 구한다.
	lt = 1
	rt = 60000000000
	t = 0
	while lt <= rt:
		mid = (lt+rt)//2
		cnt = 0
		for i in range(m):
			cnt += (1 + mid//T[i])
		if cnt >= n:
			t = mid
			rt = mid-1
		else:
			lt = mid+1
	
	#t-1까지 탑승하는 아이들 수
	cnt = 0
	for i in range(m):
		cnt += (1 + (t-1)//T[i])
	
	#t시간에서 탑승하는 아이들 수
	for i in range(m):
		if t%T[i] == 0:
			cnt += 1
		if cnt == n:
			print(i+1) #마지막 탑승 아이의 놀이기구 번호
			break

