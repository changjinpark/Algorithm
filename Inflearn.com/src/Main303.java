import java.util.Scanner;

public class Main303 {

    int solution(int n, int k, int[] arr1) {

        int answer = 0, sum = 0;

        for(int i = 0; i < k; i++) sum += arr1[i];
        answer = sum;
        for(int i = k; i < n; i++){
            sum = sum + arr1[i] - arr1[i-k];
            if(sum > answer) answer = sum;
        }
        return answer;

    }


    public static void main(String[] args) {

        Main303 T = new Main303();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();

        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = kb.nextInt();
        }

        System.out.println(T.solution(n,k,arr1));

    }
}