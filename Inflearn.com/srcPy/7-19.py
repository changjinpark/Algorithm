def Qsort(arr):
    if len(arr) < 2:
        return arr
    pivot = arr[len(arr)//2]
    left_arr, mid_arr, right_arr = [], [], []
    for x in arr:
        if x > pivot:
            right_arr.append(x)
        elif x < pivot:
            left_arr.append(x)
        else:
            mid_arr.append(x)
    return Qsort(left_arr) + mid_arr + Qsort(right_arr)


if __name__ == "__main__":
    arr = [45, 21, 23, 36, 15, 67, 11, 60, 20, 33]
    print("Before Sort : " )
    print(arr)
    print("After Sort : " )
    print(Qsort([45, 21, 23, 36, 15, 67, 11, 60, 20, 33]))