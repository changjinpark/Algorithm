a = input()
b = input()
anagram = dict()
for i in a:
    anagram[i] = anagram.get(i, 0) + 1
for i in b:
    anagram[i] = anagram.get(i, 0) - 1

for key in anagram.keys():
    if anagram[key] != 0:
        print("NO")
        break
else:
    print("YES")