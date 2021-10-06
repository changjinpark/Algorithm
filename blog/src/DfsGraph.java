import java.util.Scanner;

//인접 행렬을 이용한 DFS 구현
public class DfsGraph {
    private int nV; // 정점의 개수
    private int[][] dfsGraph; // 그래프(인접행렬)
    private boolean[] visitArr; // 정점 방문 여부 확인 배열

    //그래프의 초기화
    DfsGraph(int nV) {
        this.nV = nV;
        this.dfsGraph = new int[this.nV+1][this.nV+1];
        this.visitArr = new boolean[this.nV+1];
    }

    //그래프 추가(양방향)
    void put(int x, int y) {
        this.dfsGraph[x][y] = 1;
        this.dfsGraph[y][x] = 1;
    }

    //그래프 추가(단방향)
    void putSingle(int x, int y) {
        this.dfsGraph[x][y] = 1;
    }

    void printGraph(){
        for(int i = 0 ; i < this.dfsGraph.length ; i++){
            for(int j = 0 ; j < this.dfsGraph[i].length ; j++) {
                System.out.print(this.dfsGraph[i][j] + " ");
            }
            System.out.println();
        }
    }

    void clearVisitArr() {
        for(int i = 0; i < visitArr.length; i++){
            this.visitArr[i] = false;
        }
    }

    //그래프 탐색
    void dfs(int vIdx) {
        this.visitArr[vIdx] = true;
        System.out.print(vIdx + " ");
        for(int i = 1 ; i <= nV ; i++) {
            if(this.dfsGraph[vIdx][i] == 1 && this.visitArr[i] == false) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        int nV = 0; //정점의 개수
        int nE = 0; //간선의 개수

        Scanner sc = new Scanner(System.in);
        nV = sc.nextInt();
        nE = sc.nextInt();

        DfsGraph dfsGraph = new DfsGraph(nV);

        sc.close();

        dfsGraph.put(1, 2);
        dfsGraph.put(1, 3);
        dfsGraph.put(2, 4);
        dfsGraph.put(2, 5);
        dfsGraph.put(3, 6);
        dfsGraph.put(3, 7);
        dfsGraph.put(4, 8);
        dfsGraph.put(5, 8);
        dfsGraph.put(6, 8);
        dfsGraph.put(7, 8);

        dfsGraph.printGraph();//인접행렬 출력

        System.out.println();
        System.out.print("정접 1부터 탐색 : ");
        dfsGraph.dfs(1);
        dfsGraph.clearVisitArr();

        System.out.println();
        System.out.print("정접 2부터 탐색 : ");
        dfsGraph.dfs(2);
        dfsGraph.clearVisitArr();

        System.out.println();
        System.out.print("정접 3부터 탐색 : ");
        dfsGraph.dfs(3);
        dfsGraph.clearVisitArr();

        System.out.println();
        System.out.print("정접 4부터 탐색 : ");
        dfsGraph.dfs(4);
        dfsGraph.clearVisitArr();

        System.out.println();
        System.out.print("정접 5부터 탐색 : ");
        dfsGraph.dfs(5);
        dfsGraph.clearVisitArr();

        System.out.println();
        System.out.print("정접 6부터 탐색 : ");
        dfsGraph.dfs(6);
        dfsGraph.clearVisitArr();

        System.out.println();
        System.out.print("정접 7부터 탐색 : ");
        dfsGraph.dfs(7);
        dfsGraph.clearVisitArr();

        System.out.println();
        System.out.print("정접 8부터 탐색 : ");
        dfsGraph.dfs(8);
        dfsGraph.clearVisitArr();
    }
}
