/*A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.*/
import java.util.*;

public class Main203 {
    ArrayList<String> solution(int[] arr1, int[] arr2, int N) {

        ArrayList<String> answer = new ArrayList<String>();
        for (int i = 0 ; i < N ; i++){
            if(arr1[i]==arr2[i]) answer.add("D");
            else if((arr1[i]==1 && arr2[i]==3) || (arr1[i]==2 && arr2[i]==1) || (arr1[i]==3 && arr2[i]==2)) answer.add("A");
            else answer.add("B");
        }

        return answer;

    }

    public static void main(String[] args) {

        Main203 T = new Main203();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];
        for(int i = 0 ; i< arr1.length; i++){
            arr1[i] = kb.nextInt();
        }
        for(int i = 0 ; i< arr2.length; i++){
            arr2[i] = kb.nextInt();
        }
        for(String x : T.solution(arr1, arr2, N)){
            System.out.println(x);
        }

    }
}
