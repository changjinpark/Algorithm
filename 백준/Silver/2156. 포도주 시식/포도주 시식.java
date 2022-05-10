import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[10001];
        int[] arr = new int[10001];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = arr[0];
        dp[1] = arr[0] + arr[1];
        dp[2] = Math.max(Math.max(arr[0] + arr[2], arr[1] + arr[2]), dp[1]);

        for (int i = 3; i < n; i++) {
            //System.out.println(arr[i]+arr[i-1]+dp[i-3]);
            //System.out.println(arr[i]+dp[i-2]);
            dp[i] = Math.max(Math.max(arr[i]+arr[i-1]+dp[i-3], arr[i]+dp[i-2]), dp[i-1]);
        }

        System.out.println(dp[n-1]);
    }
}