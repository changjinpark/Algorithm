/*
자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
*/
import java.util.*;

public class Main205 {

    int solution(int N) {

        int answer = 0;
        int[] chk = new int[N+1];

        for(int i = 2; i <= N; i++){
            int j = 2;
            if(chk[i] == 0){
                answer++;
                while (i*j <= N){
                    chk[i*j]++;
                    j++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Main205 T = new Main205();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        System.out.println(T.solution(N));

    }
}
