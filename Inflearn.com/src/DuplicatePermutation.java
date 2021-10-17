import java.util.Scanner;

public class DuplicatePermutation {
    private static int beadLastNumber, numberToTakeOut;
    private static int[] beadNumberToTakeOut;

    static void dfs(int L) {
        if(L == numberToTakeOut) {
            for (int j : beadNumberToTakeOut) System.out.print(j + " ");
            System.out.println();
        }
        else {
            for(int i = 1 ; i <= beadLastNumber; i++) {
                beadNumberToTakeOut[L] = i;
                dfs(L+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        beadLastNumber = sc.nextInt();
        numberToTakeOut = sc.nextInt();
        beadNumberToTakeOut = new int[numberToTakeOut];

        dfs(0);
    }
}
