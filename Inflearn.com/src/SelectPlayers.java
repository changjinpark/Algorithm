import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class BodySpec implements Comparable<BodySpec>{
    public int height;
    public int weight;

    public BodySpec(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(BodySpec o) {
        return o.height - this.height;
    }
}

public class SelectPlayers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BodySpec> players = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            players.add(new BodySpec(height, weight));
        }

        Collections.sort(players);

        int maxWeight = Integer.MIN_VALUE;
        int cnt = 0;
        for(BodySpec bodySpec : players) {
            if(bodySpec.weight > maxWeight) {
                maxWeight = bodySpec.weight;
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}
