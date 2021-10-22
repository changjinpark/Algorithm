import java.util.Scanner;

public class FindingCombination {
    private static int beadLastNumber, numberToTakeOut;
    private static int[] combinationNumber;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        beadLastNumber = sc.nextInt();
        numberToTakeOut = sc.nextInt();
        combinationNumber = new int[numberToTakeOut];
        dfs(0, 1);
    }

    private static void dfs(int L, int startNumber) {
        if(L == numberToTakeOut) {
            for (int x : combinationNumber) System.out.print(x+" ");
            System.out.println();
        }
        else {
            for (int i = startNumber; i <= beadLastNumber; i++) {
                combinationNumber[L] = i;
                dfs(L+1, i+1);
            }
        }
    }
}
