import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RipeningTomatoes {
    static int M, N;
    static int[][] tomatoBox, elapsedDays;
    static Queue<Coordinate> Q = new LinkedList<>();
    static int[] dRow = {1, 0, -1, 0}, dColumn = {0, 1, 0, -1};

    private static void bfs() {

        while (!Q.isEmpty()) {
            Coordinate currentTomato = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nextRow = currentTomato.getRow() + dRow[i];
                int nextColumn = currentTomato.getColumn() + dColumn[i];
                if (nextRow >= 0 && nextRow < N && nextColumn >= 0 && nextColumn < M && tomatoBox[nextRow][nextColumn] == 0) {
                    tomatoBox[nextRow][nextColumn] = 1;
                    Q.offer(new Coordinate(nextRow, nextColumn));
                    elapsedDays[nextRow][nextColumn] = elapsedDays[currentTomato.getRow()][currentTomato.getColumn()] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        tomatoBox = new int[N][M];
        elapsedDays = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                tomatoBox[i][j] = sc.nextInt();
                if (tomatoBox[i][j] == 1) Q.offer(new Coordinate(i, j));
            }
        }

        bfs();

        int answer = Integer.MIN_VALUE;
        boolean isRipened = true;
        Loop1 :
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tomatoBox[i][j] == 0) {
                    System.out.println(-1);
                    isRipened = false;
                    break Loop1;
                }
                answer = Math.max(answer, elapsedDays[i][j]);
            }
        }
        if (isRipened) System.out.println(answer);
    }
}