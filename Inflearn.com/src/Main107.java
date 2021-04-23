/*앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
단 회문을 검사할 때 대소문자를 구분하지 않습니다.*/
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
