import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int N;
    private static int[][] map;
    private static int maxResult = Integer.MIN_VALUE;
    private static HashSet<Integer> Height = new HashSet<>();
    private static int[][] visited;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                Height.add(map[i][j]);
            }
        }

        for (int h : Height) {
            int cnt = 0;
            visited = new int[N][N];

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (map[r][c] >= h && visited[r][c] == 0) {
                        cnt += 1;
                        bfs(r, c, h);
                    }
                }
            }
            maxResult = Math.max(maxResult, cnt);
        }

        System.out.println(maxResult);
        br.close();
    }

    private static void bfs(int r, int c, int h) {
        int dr[] = {0, 0, 1, -1};
        int dc[] = {1, -1, 0, 0};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{r, c});
        visited[r][c] = 1;

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int curR = poll[0];
            int curC = poll[1];

            for (int i = 0; i < 4; i++) {
                int nexR = curR + dr[i];
                int nexC = curC + dc[i];
                if (nexR >= 0 && nexR < N && nexC >=0 && nexC < N) {
                    if (visited[nexR][nexC] == 0 && map[nexR][nexC] >= h) {
                        visited[nexR][nexC] = 1;
                        queue.add(new int[]{nexR, nexC});
                    }
                }
            }
        }
    }
}