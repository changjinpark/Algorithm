/*알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
단 반복횟수가 1인 경우 생략합니다.
*/
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
