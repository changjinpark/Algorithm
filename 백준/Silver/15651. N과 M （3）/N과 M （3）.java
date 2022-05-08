import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringBuilder sb = new StringBuilder();
    private static int N;
    private static int M;
    private static int[] ans;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        ans = new int[M];
        //System.out.println(N);
        //System.out.println(M);
        solution(0);
        System.out.println(sb);
    }

    private static void solution(int L) {
        if (L == M) {
            for (int a : ans) {
                sb.append(a+" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= N; i++) {
            ans[L] = i;
            solution(L+1);
        }
    }
}