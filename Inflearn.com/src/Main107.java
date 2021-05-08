import java.util.*;

public class Main107 {
    String solution(String str) {

        String answer = "";
        String test = str.toUpperCase();
        char[] chars = test.toCharArray();

        for(int i = 0 ; i < str.length()/2 ; i++){
            if(chars[i] != chars[str.length()-1-i]) answer ="NO";
        }
        if(answer!="NO") answer="YES";

        return answer;
    }

    public static void main(String[] args) {

        Main107 T = new Main107();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
