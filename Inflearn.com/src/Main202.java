import java.util.*;

public class Main202 {
    int solution(int[] arr, int N) {

        int answer = 0;
        int max = 0;
        for(int i = 0 ; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                answer++;
            }
        }

        return answer;

    }

    public static void main(String[] args) {

        Main202 T = new Main202();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[] arr = new int[N];
        for (int i = 0 ; i < N ; i++){
            arr[i] = kb.nextInt();
        }

        System.out.print(T.solution(arr, N));


    }
}
