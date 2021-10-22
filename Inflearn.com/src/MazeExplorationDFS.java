import java.util.Scanner;

public class MazeExplorationDFS {
    private static int[][] mazeBoard;
    private static int routeCount;
    private static int[] dRow = {1, 0, -1, 0}, dColumn = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mazeBoard = new int[8][8];
        for(int i = 1 ; i < mazeBoard.length; i++){
            for (int j = 1 ; j < mazeBoard[i].length ; j++) {
                mazeBoard[i][j] = sc.nextInt();
            }
        }

        mazeBoard[1][1] = 1;
        dfs(1, 1);
        System.out.println(routeCount);
    }

    private static void dfs(int row, int column) {
        if(row == 7 && column == 7) routeCount++;
        else {
            for(int i = 0 ; i < 4; i++){
                int nextRow = row+dRow[i];
                int nextColumn = column+dColumn[i];
                if(nextRow > 0 && nextRow < 8 && nextColumn > 0 && nextColumn < 8 && mazeBoard[nextRow][nextColumn] == 0) {
                    mazeBoard[nextRow][nextColumn] = 1;
                    dfs(nextRow, nextColumn);
                    mazeBoard[nextRow][nextColumn] = 0;
                    }
                }
            }
        }
}
