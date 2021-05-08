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
