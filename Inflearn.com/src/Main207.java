import java.util.*;

public class Main207 {
    int solution(int N, int[] arr) {

        int answer = 0;
        int cnt = 0;

        for(int i = 0; i < N; i++){
            if(arr[i] == 1){
                cnt++;
                answer = answer + cnt;
            }
            else cnt = 0;
        }

        return answer;
    }


    public static void main(String[] args) {

        Main207 T = new Main207();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(N, arr));

    }
}
