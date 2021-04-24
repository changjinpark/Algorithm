/*1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.*/
import java.util.*;

public class Main204 {
    List<Integer> solution(int N) {

        List<Integer> answer = new ArrayList<Integer>();
        int a1 = 1;
        int a2 = 1;
        int sum = 0;
        answer.add(a1);
        answer.add(a2);

        for(int i = 2 ; i < N ; i++){
            sum = answer.get(i-2) + answer.get(i-1);
            answer.add(sum);
        }

        return answer;

    }

    public static void main(String[] args) {

        Main204 T = new Main204();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        for (int x : T.solution(N)){
            System.out.print(x + " ");
        }


    }
}
