/*앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.*/
import java.util.*;

public class Main108 {
    String solution(String str) {

        String answer = "YES";
        str = str.toUpperCase().replaceAll("[^A-Z]",""); //정규식 표현 : 영 대문자가 아닌 경우
        int len = str.length();

        for(int i =0 ; i < len/2 ; i ++){
            if(str.charAt(i) != str.charAt(len-1-i)){
                answer = "NO";
            }
        }

        return answer;

    }

    public static void main(String[] args) {

        Main108 T = new Main108();
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }

}
