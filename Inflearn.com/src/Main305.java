import java.util.Scanner;

public class Main305 {

    int solution(int n) {

        int answer = 0, sum = 0;
        int m = n/2 + 1;
        int[] arr1 = new int[m];
        for(int i = 0; i < m; i++) arr1[i] = i+1;

        int lt = 0;
        for(int rt = 0;rt < m; rt++){
            sum = sum + arr1[rt];
            if(sum == n) answer++;
            while(sum>n){
                sum=sum - arr1[lt++];
                if(sum==n) answer++;
            }
        }

        return answer;

    }


    public static void main(String[] args) {

        Main305 T = new Main305();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.println(T.solution(n));

    }
}