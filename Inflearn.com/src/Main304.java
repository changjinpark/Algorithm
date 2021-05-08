import java.util.Scanner;

public class Main304 {

    int solution(int n, int m, int[] arr1) {

        int answer = 0, sum = 0;
        int lt = 0;
        for(int rt = 0; rt < n; rt++){
            sum = sum + arr1[rt];
            if(sum == m) answer++;
            while(sum > m){
                sum = sum - arr1[lt++];
                if(sum == m) answer++;
            }
        }

        return answer;

    }


    public static void main(String[] args) {

        Main304 T = new Main304();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = kb.nextInt();
        }

        System.out.println(T.solution(n,m,arr1));

    }
}
