def DFS(v):
    if v > 7: return
    else:
        print(v, end=' ')#이진트리 전위순회
        DFS(2*v)
        #print(v, end=' ')  #이진트리 중위순회
        DFS(2*v+1)
        #print(v, end=' ')  #이진트리 후위순회
if __name__=="__main__":
    DFS(1)