import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n;
    static int[] arr, op;
    private static int maxRes = Integer.MIN_VALUE, minRes = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        op = new int[4];
        for (int i = 0; i < 4; i++) {
            op[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);
        System.out.println(maxRes);
        System.out.println(minRes);
    }

    static void dfs(int L, int sum) {
        if (L == n) {
            maxRes = Math.max(maxRes, sum);
            minRes = Math.min(minRes, sum);
            return;
        }

        if (L == 0) {
            dfs(L + 1, sum + arr[L]);
            return;
        }

        if (op[0] > 0) {
            op[0] -= 1;
            dfs(L + 1, sum + arr[L]);
            op[0] += 1;
        }

        if (op[1] > 0) {
            op[1] -= 1;
            dfs(L + 1, sum - arr[L]);
            op[1] += 1;
        }

        if (op[2] > 0) {
            op[2] -= 1;
            dfs(L + 1, sum * arr[L]);
            op[2] += 1;
        }

        if (op[3] > 0) {
            op[3] -= 1;
            dfs(L + 1, sum / arr[L]);
            op[3] += 1;
        }
    }

}