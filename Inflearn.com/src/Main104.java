import java.util.*;

//N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
public class Main104 {

    ArrayList<String> solution(String[] str){

        ArrayList<String> answer = new ArrayList<>();

        /*StringBuilder 이용하는 방법
        for(String x : str){
            String tmp=new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }*/

        for (String x : str){

            char[] c = x.toCharArray();
            int lt = 0;
            int rt = x.length()-1;

            while (lt < rt){
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }

            answer.add(String.valueOf(c));
        }

        return answer;
    }

    public static void main(String[] args) {

        Main104 T = new Main104();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        String[] str = new String[N];
        for (int i=0;i<N;i++) {
            str[i] = kb.next();
        }
        for (String x : T.solution(str)){
            System.out.println(x);
        }
    }
}