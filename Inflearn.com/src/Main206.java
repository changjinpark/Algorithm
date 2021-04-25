/*N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.*/
import java.util.*;

public class Main206 {

    ArrayList<Integer> solution(int N, String[] strings) {

        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i = 0; i < strings.length; i++){
            String s= new StringBuilder(strings[i]).reverse().toString();
            int n = Integer.parseInt(s);
            if(isPrime(n)) answer.add(n);
        }
        return answer;
    }

    boolean isPrime(int n) {

        if(n==1) return false;
        for (int i=2; i < n; i++){
            if (n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Main206 T = new Main206();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        String[] strings = new String[N];
        for(int i = 0; i < N; i++){
            strings[i] = kb.next();
        }
        for (int x : T.solution(N, strings)){
            System.out.print(x + " ");
        }

    }
}
