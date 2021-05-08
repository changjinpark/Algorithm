import java.util.*;

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