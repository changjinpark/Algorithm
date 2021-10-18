import java.util.Scanner;

public class FindingPermutation {
    private static int m, n;
    private static int[] check, randomNumber, permutationNumber;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        randomNumber = new int[n];
        for(int i = 0; i < n; i++) {
            randomNumber[i] = sc.nextInt();
        }
        check = new int[n];
        permutationNumber = new int[m];
        dfs(0);

    }

    private static void dfs(int L) {
        if(L == m) {
            for (int x : permutationNumber) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
        else {
            for(int i = 0; i < n ; i++) {
                if(check[i] != 1) {
                    check[i] = 1;
                    permutationNumber[L] = randomNumber[i];
                    dfs(L+1);
                    check[i] = 0;
                }
            }
        }
    }
}
