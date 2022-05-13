import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int n, s, cnt, k;
    private static int[] arr;
    private static boolean[] visited;
    private static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        k = n;
        while (k > 0) {
            visited = new boolean[n];
            dfs(0, 0);
            k -= 1;
        }

        System.out.println(cnt);
    }

    private static void dfs(int L, int start) {
        if (L == k) {
            int tmp = 0;
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    tmp += arr[i];
                }
            }

            if (tmp == s) {
                cnt += 1;
            }
            return;
        }

        for (int i = start; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(L+1, i+1);
                visited[i] = false;
            }
        }
    }
}