/*만약 A학생이 멘토이고, B학생이 멘티가 되는 짝이 되었다면, A학생은 M번의 수학테스트에서 모두 B학생보다 등수가 앞서야 합니다.
M번의 수학성적이 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇 가지 인지 출력하는 프로그램을 작성하세요.*/
import java.util.*;

public class Main212 {
    int solution(int n, int m, int[][] arr) {

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for(int k = 0; k < m; k++){// 테스트 번호
                    int pi = 0, pj = 0;
                    for(int s = 0; s < n; s++){ //학생 등수
                        if(arr[k][s] == i) pi = s;
                        if(arr[k][s] == j) pj = s;
                    }
                    if(pi < pj) cnt++;
                }
                if(cnt==m) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Main212 T = new Main212();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, m, arr));
    }
}
