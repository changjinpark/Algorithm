import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int k;
    private static int[] s;
    private static int[] visited;
    private static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            s = new int[k];
            visited = new int[k];

            for (int i = 0; i < k; i++) {
                s[i] = Integer.parseInt(st.nextToken());
            }
            if (k == 0) {
                break;

            }
            sb = new StringBuilder();
            dfs(0, 0);
            System.out.println(sb);
        }
    }

    private static void dfs(int L, int start) {
        if (L == 6) {
            for (int i = 0; i < k; i++) {
                if (visited[i] == 1) {
                    sb.append(s[i]+" ");
                }
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < k; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                dfs(L+1, i+1);
                visited[i] = 0;
            }
        }
    }
}