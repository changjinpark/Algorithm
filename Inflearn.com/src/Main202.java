/*선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)*/
import java.util.*;

public class Main202 {
    int solution(int[] arr, int N) {

        int answer = 0;
        int max = 0;
        for(int i = 0 ; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                answer++;
            }
        }

        return answer;

    }

    public static void main(String[] args) {

        Main202 T = new Main202();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[] arr = new int[N];
        for (int i = 0 ; i < N ; i++){
            arr[i] = kb.nextInt();
        }

        System.out.print(T.solution(arr, N));


    }
}
