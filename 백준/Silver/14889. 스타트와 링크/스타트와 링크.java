import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int n, minDiff = Integer.MAX_VALUE;
    private static int[][] A;
    private static int[] visited;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        A = new int[n][n];
        visited = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        combination(0, 0);
        System.out.println(minDiff);
    }

    private static void combination(int depth, int s) {
        if (depth == n/2) {
            int start = 0;
            int link = 0;
            for (int i = 0; i < n-1; i++) {
                for (int j = i+1; j < n; j++) {
                    if (visited[i] == 1 && visited[j] == 1) {
                        start += (A[i][j] + A[j][i]);
                    }
                    else if (visited[i] == 0 && visited[j] == 0) {
                        link += (A[i][j] + A[j][i]);
                    }
                }
            }
            minDiff = Math.min(minDiff, Math.abs(start-link));
            return;
        }

        for (int i = s; i < n; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                combination(depth+1, i+1);
                visited[i] = 0;
            }
        }

    }
}