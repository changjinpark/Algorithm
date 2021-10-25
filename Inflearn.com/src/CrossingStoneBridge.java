import java.util.Scanner;

public class CrossingStoneBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStones = sc.nextInt();
        int[] dy = new int[numberOfStones+1];
        dy[1] = 2;
        dy[2] = 3;
        for(int i = 3; i <= numberOfStones; i++) {
            dy[i] = dy[i-1] + dy[i-2];
        }
        System.out.println(dy[numberOfStones]);
    }
}
