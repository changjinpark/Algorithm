from collections import deque
need = input()
n = int(input())
for i in range(n):
    plan = input()
    dq = deque(need)
    for x in plan:
        if x in dq:
            if x != dq.popleft():
                print("#"+str(i+1)+" NO")
                break
    else:
       if len(dq) == 0:
            print("#"+str(i+1)+" YES")
       else:
           print("#" + str(i+1) + " NO")