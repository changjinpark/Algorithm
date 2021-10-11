def Dsort(arr):
    if len(arr) < 2:
        return arr
    mid = len(arr)//2
    left = Dsort(arr[:mid])
    right = Dsort(arr[mid:])
    p1 = p2 = 0
    tmp = []
    while p1 < len(left) and p2 < len(right):
        if left[p1] < right[p2]:
            tmp.append(left[p1])
            p1+=1
        else:
            tmp.append(right[p2])
            p2+=1
    if p1 < len(left) : tmp = tmp + left[p1:]
    if p2 < len(right): tmp = tmp + right[p2:]
    return tmp


if __name__ == "__main__":
    arr = [23, 11, 45, 36, 15, 67, 33, 21]
    print("Before Sort : " )
    print(arr)

    print("After Sort : " )
    print(Dsort([23, 11, 45, 36, 15, 67, 33, 21]))