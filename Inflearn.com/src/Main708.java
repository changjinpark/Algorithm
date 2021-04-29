import java.util.*;

public class Main708 {
    int[] dis = {-1, 1, 5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0;

        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int cur = Q.poll();
                if(cur == e) return L;
                for(int x : dis){
                    if(cur+x >= 1 && cur+x <= 10000 && ch[cur+x] == 0) {
                        Q.offer(cur+x);
                        ch[cur+x] = 1;
                    }
                }
            }
            L++;
        }
        return 0;
    }
    public static void main(String[] args) {
        Main708 Tree = new Main708();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();
        System.out.println(Tree.BFS(s ,e));
    }
}
