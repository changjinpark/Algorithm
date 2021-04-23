/*소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.*/
import java.util.*;

public class Main106 {
    String solution(String str) {

        String answer = "";
        for(int i = 0; i < str.length(); i++){
            //System.out.println(str.charAt(i)+ " "+ i + " " + str.indexOf(str.charAt(i)));
            if(i==str.indexOf(str.charAt(i))){
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main106 T = new Main106();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
