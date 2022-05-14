import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static int n;
    static int[] row;
    private static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        row = new int[n];
        cnt = 0;
        dfs(0);
        System.out.println(cnt);
    }

    static void dfs(int x) {
        if (x == n) {
            cnt += 1;
            return;
        }
        for (int i = 0; i < n; i++) {
            row[x] = i;
            if (isPossible(x)) {
                dfs(x+1);
            }
        }
    }

    private static boolean isPossible(int x) {
        for (int y = 0; y < x; y++) {
            if (row[x] == row[y] || (Math.abs(x-y) == Math.abs(row[x]-row[y]))){
                return false;
            }
        }
        return true;
    }
}