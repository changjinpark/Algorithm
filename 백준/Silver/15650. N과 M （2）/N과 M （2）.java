import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int N;
    private static int M;
    private static int[] visited;
    private static int[] ans;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new int[N+1];
        ans = new int[M];
        //System.out.println(N);
        //System.out.println(M);
        solution(0, 1);
    }

    private static void solution(int L, int start) {
        if (L == M) {
            for (int a : ans) {
                System.out.print(a + " ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= N; i++) {
            ans[L] = i;
            solution(L+1, i+1);
        }
    }
}