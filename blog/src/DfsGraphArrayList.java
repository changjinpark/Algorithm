import java.util.ArrayList;
import java.util.Scanner;

//인접 리스트를 이용한 DFS 구현
public class DfsGraphArrayList {
    private int nV; // 정점의 개수
    private ArrayList<ArrayList<Integer>> dfsGraph; // 그래프(인접행렬)
    private boolean[] visitArr; // 정점 방문 여부 확인 배열

    //그래프의 초기화
    DfsGraphArrayList(int nV) {
        this.nV = nV;
        this.dfsGraph = new ArrayList<ArrayList<Integer>>();//그래프 생성
        // put(int x, int y)에서 정점은 0을 사용 안하므로,
        // ArrayIndexOutOfBoundsException 방지를 위해
        // 인접리스트의 사이즈는 정점의 개수의 1을 더한 사이즈로 초기화해줌
        for(int i = 0 ; i < this.nV + 1 ; i++) {
            this.dfsGraph.add(new ArrayList<Integer>());
        }
        this.visitArr = new boolean[this.nV+1];
    }

    //그래프 추가(양방향)
    void put(int x, int y) {
        this.dfsGraph.get(x).add(y);
        this.dfsGraph.get(y).add(x);
    }

    //그래프 추가(단방향)
    void putSingle(int x, int y) {
        this.dfsGraph.get(x).add(y);
    }

    void printGraphToAdjList(){
        for(int i = 1 ; i < this.dfsGraph.size() ; i++){
            System.out.print("정점 "+ i + "의 인접리스트");
            for(int j = 0 ; j < this.dfsGraph.get(i).size() ; j++) {
                System.out.print(" -> " + this.dfsGraph.get(i).get(j) + " ");
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
        for(int i : this.dfsGraph.get(vIdx)){
            if(visitArr[i] == false) {
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

        DfsGraphArrayList dfsGraph = new DfsGraphArrayList(nV);

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

        dfsGraph.printGraphToAdjList();//인접리스트 출력

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
