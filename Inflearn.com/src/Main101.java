import java.util.*;

public class Main101 {

    int solution(String str, char c){

        int anwser = 0;
        str = str.toUpperCase();//문자열 대문자로 변환
        c = Character.toUpperCase(c);//문자 대문자로 변환

        for(char x : str.toCharArray()){
            if (x==c) anwser++;
        }

        return anwser;
    }

    public static void main(String[] args) {

        Main101 T = new Main101();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        char c = kb.next().charAt(0);//문자 입력
        System.out.println(T.solution(str, c));
    }
}