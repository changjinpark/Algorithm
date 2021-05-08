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
