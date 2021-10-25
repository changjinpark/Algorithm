import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class UnfinishedPlayers {

    static String[] participant = {"leo", "kiki", "eden"};
    static String[] completion = {"eden", "kiki"};

    @Test
    public void solution() {
        String answer = "";
        Map<String, Integer> players = new HashMap<>();
        for(String p : participant) players.put(p, players.getOrDefault(p, 0) + 1);
        for (String c : completion) players.put(c, players.get(c) - 1);

        for(String playerName : players.keySet()){
            if(players.get(playerName) != 0 ) answer = playerName;
        }

        System.out.println(answer);
    }

}
