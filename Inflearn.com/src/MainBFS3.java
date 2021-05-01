//1번 정점에서 각 정점으로 가는 최소 이동 간선수를 출력하세요.
import java.util.*;
public class MainBFS3 {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;
    public void BFS(int v){
        ch[v] = 1;
        dis[v] = 0;
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(v);
        while (!Q.isEmpty()){
            int cv = Q.poll();
            for(int nv : graph.get(cv)){
                if(ch[nv]==0){
                    ch[nv] = 1;
                    Q.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }
    public static void main(String[] args){
        MainBFS3 T = new MainBFS3();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0 ; i <= n ; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        dis = new int[n+1];
        for(int i = 0; i < m ; i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        T.BFS(1);
        for(int i = 2; i <= n; i++){
            System.out.println(i + " : " + dis[i]);
        }
    }
}
