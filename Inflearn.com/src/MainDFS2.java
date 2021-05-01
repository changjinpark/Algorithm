import java.util.*;

//방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요.
public class MainDFS2 {
    static int n, m, answer = 0;
    static int ch[];
    static ArrayList<ArrayList<Integer>> graph;

    public void DFS(int v){
        if(v == n) answer++;
        else{
            for(int nv : graph.get(v)){
                if(ch[nv] == 0){
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args){
        MainDFS2 T = new MainDFS2();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0 ; i <= n ; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for(int i = 0 ; i < m ; i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
