//이진 트리에서 루트 노드에서 말단 노드까지 가장 짧은 길이

import java.util.*;

public class MainBFS2 {
    Node root;
    public int BFS(Node root){
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while (!Q.isEmpty()){
            for(int i = 0 ; i < Q.size() ; i++){
                Node cur = Q.poll();
                if(cur.lt == null && cur.rt == null) return L;
                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
                }
            L++;
            }
        return 0;
    }
    public static void main(String[] args){
        MainBFS2 Tree = new MainBFS2();
        Tree.root = new Node(1);
        Tree.root.lt = new Node(2);
        Tree.root.rt = new Node(3);
        Tree.root.lt.lt = new Node(4);
        Tree.root.lt.rt = new Node(5);
        System.out.println(Tree.BFS(Tree.root));
    }
}
