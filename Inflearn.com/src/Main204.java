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
