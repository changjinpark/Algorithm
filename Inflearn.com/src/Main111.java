import java.util.*;

public class Main111 {

    String solution(String str) {

        String answer = "";
        str = str + " ";
        int cnt = 1;

        for(int i = 0 ; i < str.length()-1 ; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                cnt++;
            }else {
                answer = answer + str.charAt(i);
                if(cnt > 1) answer += cnt;
                cnt = 1;
            }
        }

        return answer;

    }

    public static void main(String[] args) {

        Main111 T = new Main111();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
