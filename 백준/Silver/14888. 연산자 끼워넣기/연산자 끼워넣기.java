import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int n, minRes = Integer.MAX_VALUE, maxRes = Integer.MIN_VALUE;
    private static int[] A;
    private static int[] op;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        A = new int[n];
        op = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            op[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);
        System.out.println(maxRes);
        System.out.println(minRes);
    }

    private static void dfs(int depth, int val) {
        if (depth == n) {
            minRes = Math.min(minRes, val);
            maxRes = Math.max(maxRes, val);
            return;
        }

        if (depth == 0) {
            dfs(depth+1, val+A[depth]);
        }
        if (op[0] > 0) {
            op[0] -= 1;
            dfs(depth+1, val+A[depth]);
            op[0] += 1;
        }
        if (op[1] > 0) {
            op[1] -= 1;
            dfs(depth+1, val-A[depth]);
            op[1] += 1;
        }
        if (op[2] > 0) {
            op[2] -= 1;
            dfs(depth+1, val*A[depth]);
            op[2] += 1;
        }
        if (op[3] > 0) {
            op[3] -= 1;
            dfs(depth+1, val/A[depth]);
            op[3] += 1;
        }
    }

}