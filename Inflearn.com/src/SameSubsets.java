import java.util.Scanner;

public class SameSubsets {
    private static String answer = "NO";
    private static int[] subsets;
    private static int totalSum;
    private static int n;
    private boolean flag =false;

    public void DFS(int L, int sum) {
        if(flag) return;
        if(sum > totalSum/2) return;
        if(L==n){
            if((totalSum - sum) == sum) {
                flag = true;
                answer = "YES";
            }
        }
        else {
            DFS(L+1, sum + subsets[L]);
            DFS(L+1, sum);
        }
    }

    public static void main(String[] args) {
        SameSubsets T = new SameSubsets();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        subsets = new int[n];
        for(int i = 0 ; i < n ; i++) {
            subsets[i] = sc.nextInt();
            totalSum += subsets[i];
        }
        T.DFS(0, 0);
        System.out.println(answer);
    }
}
