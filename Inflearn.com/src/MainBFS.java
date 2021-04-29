import java.util.*;
public class MainBFS {
    Node root;
    public void BFS(Node root){
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while (!Q.isEmpty()){
            int len = Q.size();
            System.out.print(L+" ");
            for(int i = 0; i < len; i++){
                Node cur = Q.poll();
                System.out.print(cur.value+ " ");
                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }
    public static void main(String[] args){
        MainBFS Tree = new MainBFS();
        Tree.root = new Node(1);
        Tree.root.lt = new Node(2);
        Tree.root.rt = new Node(3);
        Tree.root.lt.lt = new Node(4);
        Tree.root.lt.rt = new Node(5);
        Tree.root.rt.lt = new Node(6);
        Tree.root.rt.rt = new Node(7);
        Tree.BFS(Tree.root);
    }
}
