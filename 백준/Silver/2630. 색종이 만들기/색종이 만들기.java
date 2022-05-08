import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int N;
    private static int[][] map;
    private static int white;
    private static int blue;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution(0, 0, N);
        System.out.println(white);
        System.out.println(blue);
    }

    private static void solution(int r, int c, int N) {
        int tmp = map[r][c];
        for (int i = r; i < r+N; i++) {
            for (int j = c; j < c+N; j++) {
                if (tmp != map[i][j]) {
                    solution(r, c, N / 2);
                    solution(r, c + N / 2, N / 2);
                    solution(r + N / 2, c, N / 2);
                    solution(r + N / 2, c + N / 2, N / 2);
                    return;
                }
            }
        }
        if (tmp == 0) {
            white += 1;
        } else if (tmp == 1) {
            blue += 1;
        }
    }

}