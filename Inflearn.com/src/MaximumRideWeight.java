import java.util.Scanner;

public class MaximumRideWeight {

    private static int limit, n, answer = Integer.MIN_VALUE;
    private static int[] dogWeight;

    private static void dfs(int L, int weightSum) {
        if(weightSum > limit) return;
        if(L == n) {
            if(weightSum>answer) {
                answer = weightSum;
            }
        }
        else {
            dfs(L+1, weightSum + dogWeight[L]);
            dfs(L+1, weightSum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        limit = sc.nextInt();
        n = sc.nextInt();
        dogWeight = new int[n];
        for(int i = 0 ; i < n ; i++){
            dogWeight[i] = sc.nextInt();
        }

        dfs(0,0);
        System.out.println(answer);
    }
}
