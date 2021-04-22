import java.util.*;

//대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
public class Main102 {

    String solution(String str){

        String answer="";

        for(char x : str.toCharArray()){
            if(Character.isUpperCase(x)) answer += Character.toLowerCase(x);
            else answer += Character.toUpperCase(x);
        }

        return answer;
    }

    public static void main(String[] args) {

        Main102 T = new Main102();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.println(T.solution(str));
    }
}