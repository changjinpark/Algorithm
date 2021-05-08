import java.util.*;

public class Main209 {
    int solution(int n, int[][] arr) {

        int answer = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 = sum1 + arr[i][j];
                sum2 = sum2 + arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < n; i++) {
            sum1 = sum1 + arr[i][i];
            sum2 = sum2 + arr[i][n-1-i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }


    public static void main(String[] args) {

        Main209 T = new Main209();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(n, arr));
    }
}
