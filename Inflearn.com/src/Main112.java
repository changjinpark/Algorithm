import java.util.*;

public class Main112 {

        String solution(String str, int N) {

        String answer = "";

        String replace = str.replace("#", "1").replace("*", "0");

        for(int i = 0 ; i < N ; i ++){
            answer += String.valueOf((char) Integer.parseInt(replace.substring(0,7),2)); // 2진수 -> 10진수
            replace = replace.substring(7);
        }


        return answer;

    }

    public static void main(String[] args) {

        Main112 T = new Main112();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(str , N));

    }

}
