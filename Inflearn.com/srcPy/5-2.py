n = input()
stack = []
sum = 0
for i in range(len(n)):
    if n[i] == '(':
        stack.append(n[i])
    elif n[i] == ')':
        if n[i-1] == '(':
            stack.pop()
            sum += len(stack)
        elif n[i-1] == ')':
            stack.pop()
            sum += 1
print(sum)


