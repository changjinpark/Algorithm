import java.util.*;

class Coordinate {
    private int row, column;
    public Coordinate(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

}

public class MazeExplorationBFS {
    private static int[][] mazeBoard, minDistance;
    private static int[] dRow = {1,0,-1,0}, dColumn = {0,1,0,-1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mazeBoard = new int[8][8];
        minDistance = new int[8][8];
        for(int i = 1; i < mazeBoard.length; i++) {
            for (int j = 1; j < mazeBoard[i].length ; j++) {
                mazeBoard[i][j] = sc.nextInt();
            }
        }
        bfs(1,1);
        if (minDistance[7][7] == 0) System.out.println(-1);
        else System.out.println(minDistance[7][7]);
    }

    private static void bfs(int row, int column) {
        Queue<Coordinate> Q = new LinkedList<>();
        mazeBoard[1][1] = 1;
        Q.offer(new Coordinate(row, column));
        while (!Q.isEmpty()) {
            Coordinate currentCoordinate = Q.poll();
            for(int i = 0; i < 4; i++) {
                int nextRow = currentCoordinate.getRow() + dRow[i];
                int nextColumn = currentCoordinate.getColumn() + dColumn[i];
                if(nextRow > 0 && nextRow < 8 && nextColumn > 0 && nextColumn < 8 && mazeBoard[nextRow][nextColumn]==0){
                    mazeBoard[nextRow][nextColumn] = 1;
                    Q.offer(new Coordinate(nextRow, nextColumn));
                    minDistance[nextRow][nextColumn] = minDistance[currentCoordinate.getRow()][currentCoordinate.getColumn()] + 1;
                }
            }
        }
    }
}
