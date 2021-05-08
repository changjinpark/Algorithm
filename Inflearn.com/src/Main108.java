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
