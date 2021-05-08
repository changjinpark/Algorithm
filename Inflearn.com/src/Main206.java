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
