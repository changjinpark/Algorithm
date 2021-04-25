/*
각 학생들이 1학년부터 5학년까지 속했던 반이 주어질 때, 임시 반장을 정하는 프로그램을 작성하시오.
*/
import java.util.*;

public class Main211 {
    int solution(int n, int[][] arr) {

        int max = -1;
        int answer = 0;
        for(int i = 1; i < n+1; i++) {//번 학생
            int cnt = 0;
            for (int j = 1; j < n+1; j++) {//번 학생
                for (int k = 1; k < 6; k++) {//학년
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max){
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Main211 T = new Main211();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[n+1][6];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<6;j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));

    }
}
