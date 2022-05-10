import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[26];
        for (int i = 0; i < n; i++) {
            String alpha = br.readLine();
            int alphaLength = alpha.length();
            for (int j = 0; j < alphaLength; j++) {
                arr[alpha.charAt(j) - 'A'] += (int) Math.pow(10, alphaLength-j-1);
            }
        }

        Arrays.sort(arr);

        int ans = 0;
        for (int i = 25; i > 16; i--) {
            ans += arr[i] * (i-16);
        }

        System.out.println(ans);
    }
}