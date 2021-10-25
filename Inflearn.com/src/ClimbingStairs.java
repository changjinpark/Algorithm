import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStairs = sc.nextInt();
        int[] dy = new int[numberOfStairs+1];
        dy[1] = 1;
        dy[2] = 2;
        for(int i = 3 ; i <= numberOfStairs; i++) {
            dy[i] = dy[i-1] + dy[i-2];
        }
        System.out.println(dy[numberOfStairs]);
    }
}
