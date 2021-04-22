import java.util.*;

//한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
public class Main103 {

    String solution(String str){

        String answer = "";
        String tmp = "";
        int max = 0;
        int pos;

        while (( pos = str.indexOf(" ") ) != -1) {//indexOf() 특정 문자 처음 발견 위치 반환

            tmp = str.substring(0, pos);//문자열 start부터 end"전"까지 문자열 발췌
            int len = tmp.length();

            if (len > max) {
                max = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }

        if (str.length() > max) answer = str;//문장 속 마지막 단어 고려

        return answer;
    }

    public static void main(String[] args) {

        Main103 T = new Main103();
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}