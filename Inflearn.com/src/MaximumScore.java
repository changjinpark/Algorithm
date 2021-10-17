import java.util.Scanner;

public class MaximumScore {
    private static int numberOfProblems, timeLimit, maxScore = Integer.MIN_VALUE;
    private static int[] point, timeItTakes;

    static void dfs(int L, int pointSum, int timeSum) {
        if(timeSum > timeLimit) return;
        if(L == numberOfProblems) {
            if (pointSum > maxScore) {
                maxScore = pointSum;
            }
        }
        else {
            dfs(L+1, pointSum + point[L], timeSum + timeItTakes[L]);
            dfs(L+1, pointSum , timeSum );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        numberOfProblems = sc.nextInt();
        timeLimit = sc.nextInt();
        point = new int[numberOfProblems];
        timeItTakes = new int[numberOfProblems];

        for (int i = 0 ; i < numberOfProblems; i++) {
            point[i] = sc.nextInt();
            timeItTakes[i] = sc.nextInt();
        }

        dfs(0, 0, 0);
        System.out.println(maxScore);
    }
}
