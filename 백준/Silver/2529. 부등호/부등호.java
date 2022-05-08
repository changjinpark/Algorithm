import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int k;
    private static List<Character> A = new ArrayList<>();
    private static String minResult = "";
    private static String maxResult = "";
    private static int[] visited = new int[10];

    public static void main(String[] args) throws IOException {
        k = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            A.add(st.nextToken().charAt(0));
        }
        //System.out.println(A);

        solution(0, "");

        System.out.println(maxResult);
        System.out.println(minResult);
        br.close();
    }

    private static void solution(int L, String s) {
        if (L == k+1) {
            if (minResult.length() == 0) {
                minResult = s;
            }
            else {
                maxResult = s;
            }
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (visited[i] == 1) continue;
            if (L == 0 || check(Character.getNumericValue(s.charAt(L-1)), A.get(L-1), i)) {
                visited[i] = 1;
                solution(L+1, s+i);
                visited[i] = 0;
            }
        }
    }

    private static boolean check(int a, Character b, int c) {
        if (b == '<') {
            return a < c;
        }
        else {
            return a > c;
        }
    }
}
