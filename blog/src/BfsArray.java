import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BfsArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//정점의 수
        int m = sc.nextInt();//간선의 수
        int v = sc.nextInt();//시작 위치

        boolean[] visited = new boolean[n+1];//방문 여부

        int[][] adjArray = new int[n+1][n+1];

        for(int i = 0; i < m; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjArray[v1][v2] = 1;
            adjArray[v2][v1] = 1;
        }
        System.out.println("BFS-인접행렬");
        bfs(v, adjArray, visited);
    }

    public static void bfs(int v, int[][] adjArray, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited[v] = true;
        while (!q.isEmpty()) {
            v = q.poll();
            System.out.print(v + " ");
            for (int i = 0 ; i < adjArray[v].length ; i++ ) {
                if(adjArray[v][i] == 1 && !visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
