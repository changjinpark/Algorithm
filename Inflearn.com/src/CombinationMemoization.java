import java.util.Scanner;

public class CombinationMemoization {

    private static int[][] combinationMemoization = new int[34][34];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(dfs(n,r));
    }

    private static int dfs(int n, int r) {
        if (combinationMemoization[n][r] > 0) return combinationMemoization[n][r];
        if (n==r || r==0) return 1;
        return combinationMemoization[n][r] = dfs(n-1, r-1) + dfs(n-1, r);
    }
}
