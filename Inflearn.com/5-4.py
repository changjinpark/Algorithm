n = input()
stack = []
for x in n:
    if x.isdecimal():
        stack.append(int(x))
    elif x == '*':
        n1 = stack.pop()
        n2 = stack.pop()
        stack.append(n1*n2)
    elif x == '/':
        n1 = stack.pop()
        n2 = stack.pop()
        stack.append(n2/n1)
    elif x == '+':
        n1 = stack.pop()
        n2 = stack.pop()
        stack.append(n1+n2)
    elif x == '-':
        n1 = stack.pop()
        n2 = stack.pop()
        stack.append(n2-n1)
print(stack.pop())