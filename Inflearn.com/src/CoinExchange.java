import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CoinExchange {

    private static int totalMoney, minNumberOfCoin = Integer.MAX_VALUE;
    private static Integer[] typeOfCoin;

    static void dfs(int L, int sumCoin){
        if(sumCoin > totalMoney) return;
        if(L >= minNumberOfCoin) return;
        if(sumCoin == totalMoney) {
            if(L < minNumberOfCoin) {
                minNumberOfCoin = L;
            }
        }
        else {
            for(int i = 0 ; i < typeOfCoin.length ; i++) {
                dfs(L+1, sumCoin + typeOfCoin[i]);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCoin = sc.nextInt();
        typeOfCoin = new Integer[numberOfCoin];
        for(int i = 0; i < numberOfCoin; i++){
            typeOfCoin[i] = sc.nextInt();
        }
        Arrays.sort(typeOfCoin, Collections.reverseOrder());
        totalMoney = sc.nextInt();
        dfs(0, 0);
        System.out.println(minNumberOfCoin);
    }
}
