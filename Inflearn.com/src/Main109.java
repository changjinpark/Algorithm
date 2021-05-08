import java.util.*;

public class Main109 {
    int solution(String str) {

        int sum = 0;

        for(char x : str.toCharArray()){
            if(Character.isDigit(x)){
                sum = sum * 10 + Character.getNumericValue(x) ;
            }
        }

        return sum;

    }

    public static void main(String[] args) {

        Main109 T = new Main109();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
