import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int n, s, cnt;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);

        if (s == 0) {
            System.out.println(cnt-1);
        }
        else {
            System.out.println(cnt);
        }
    }

    private static void dfs(int L, int sum) {
        if (L == n) {
            if (sum == s) {
                cnt += 1;
            }
            return;
        }

        dfs(L+1, sum+arr[L]);
        dfs(L+1, sum);
    }
}