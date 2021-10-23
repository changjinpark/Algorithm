import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NumberOfIslands {
    private static int n;
    private static int countNumberOfIslands;
    private static int[] dRow = {1,1,0,-1,-1,-1,0,1}, dColumn = {0,1,1,1,0,-1,-1,-1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] board = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        solution(board);
        System.out.println(countNumberOfIslands);
    }

    private static void solution(int[][] board) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 1) {
                    board[i][j] = 0;
                    countNumberOfIslands++;
                    bfs(board, i, j);
                }
            }
        }
    }

    private static void bfs(int[][] board, int row, int column) {
        Queue<Coordinate> Q = new LinkedList<>();
        Q.offer(new Coordinate(row, column));
        while (!Q.isEmpty()) {
            Coordinate current = Q.poll();
            for(int i = 0; i < 8; i++) {
                int nextRow = current.getRow() + dRow[i];
                int nextColumn = current.getColumn() + dColumn[i];
                if(nextRow >= 0 && nextRow < n && nextColumn >=0 && nextColumn < n && board[nextRow][nextColumn] == 1){
                    board[nextRow][nextColumn] = 0;
                    Q.offer(new Coordinate(nextRow, nextColumn));
                }
            }
        }
    }
}
