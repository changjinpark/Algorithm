/*N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.*/
import java.util.*;

public class Main208 {
    int[] solution(int N, int[] arr) {

        int[] answer = new int[N];

        for(int i = 0; i < N; i++){
            int level = 1;
            for(int j = 0; j < N; j++){
                if(arr[j] > arr[i]) level++;
            }
            answer[i] = level;
        }
        return answer;
    }


    public static void main(String[] args) {

        Main208 T = new Main208();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(N, arr)){
            System.out.print(x+" ");
        }

    }
}
