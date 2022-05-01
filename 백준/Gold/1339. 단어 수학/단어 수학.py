import sys

input = sys.stdin.readline

n = int(input())
alphabets = []
for _ in range(n):
    alphabets.append(input().strip())
#print(alphabets)

alphabet_dict = {}
for alphabet in alphabets:
    alphabet_len = len(alphabet)
    for i in range(alphabet_len):
        alphabet_dict[alphabet[i]] = alphabet_dict.get(alphabet[i], 0) + pow(10, alphabet_len-1-i)
#print(alphabet_dict)

alphabet_num = sorted(alphabet_dict.items(), key=lambda x : x[1], reverse=True)
#print(alphabet_num, len(alphabet_num))

res = 0
t = len(alphabet_num)
for i in range(9, 9-t, -1):
    res += alphabet_num[9-i][1] * i
print(res)