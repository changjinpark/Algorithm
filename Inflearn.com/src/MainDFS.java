class Node{
    int value;
    Node lt, rt;
    Node(int val){
        value = val;
        lt = rt = null;
    }
}

public class MainDFS {
    Node root;
    public void DFS(Node root){
        if(root == null) return;
        else {
            System.out.print(root.value+ " ");//전위순회
            DFS(root.lt);
            //System.out.print(root.value+ " ");//중위순회
            DFS(root.rt);
            //System.out.print(root.value+ " ");//후위순회
        }
    }

    public static void main(String[] args){
        MainDFS Tree = new MainDFS();
        Tree.root = new Node(1);
        Tree.root.lt = new Node(2);
        Tree.root.rt = new Node(3);
        Tree.root.lt.lt = new Node(4);
        Tree.root.lt.rt = new Node(5);
        Tree.root.rt.lt = new Node(6);
        Tree.root.rt.rt = new Node(7);
        Tree.DFS(Tree.root);
    }
}
