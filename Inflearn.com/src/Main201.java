//N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
import java.util.*;

public class Main201 {
    ArrayList<Integer> solution(int[] nlist, int N) {

        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i = 0 ; i < nlist.length ; i++){
            if(i == 0) answer.add(nlist[0]);
            else if(nlist[i] > nlist[i-1]){
                answer.add(nlist[i]);
            }
        }

        return answer;

    }

    public static void main(String[] args) {

        Main201 T = new Main201();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[] nlist = new int[N];
        for (int i = 0 ; i < N ; i++){
            nlist[i] = kb.nextInt();
        }
        for(int x : T.solution(nlist , N)){
            System.out.print(x + " ");
        }

    }
}
