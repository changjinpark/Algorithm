import java.util.*;

public class Main110 {
    int[] solution(String str, char c) {

        int[] answer = new int[str.length()];
        int length = 1000;

        for(int i = 0 ; i < str.length() ; i++){
            if(c == str.charAt(i)) {
                length = 0;
                answer[i] = length;
            }
            else {
                length ++;
                answer[i] = length;
            }
        }
        for(int i = str.length()-1 ; i >= 0 ; i--){
            if(c == str.charAt(i)) {
                length = 0;
                answer[i] = length;
            }
            else {
                length ++;
                if(length < answer[i]) answer[i] = length;
            }
        }

        return answer;

    }

    public static void main(String[] args) {

        Main110 T = new Main110();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        char c = kb.next().charAt(0);
        for(int x : T.solution(str,c)){
            System.out.print(x + " ");
        }
    }
}
