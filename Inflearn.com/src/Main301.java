//오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.

import java.util.ArrayList;
import java.util.Scanner;

public class Main301 {

    ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {

        ArrayList<Integer> answer = new ArrayList();
        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m){
            if(arr1[p1] < arr2[p2]){
                answer.add(arr1[p1++]);
            }
            else {
                answer.add(arr2[p2++]);
            }
        }
        while (p1 < n) answer.add(arr1[p1++]);
        while (p2 < m) answer.add(arr2[p2++]);

        return answer;

    }


    public static void main(String[] args) {

        Main301 T = new Main301();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++){
            arr2[i] = kb.nextInt();
        }
        for(int x : T.solution(n,m,arr1,arr2)) System.out.print(x+" ");

    }
}