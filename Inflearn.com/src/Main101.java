import java.util.*;

//한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
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