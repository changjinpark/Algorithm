import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SelectBestAlbums {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        solution(genres, plays);
    }

    private static int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0 ; i < genres.length ; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0)+plays[i]);
        }

        ArrayList<String> genresOrder = new ArrayList<>();
        while (!map.isEmpty()) {
            int maxValue = -1;
            String maxKey = "";
            for(String key : map.keySet()){
                if(map.get(key) > maxValue) {
                    maxValue = map.get(key);
                    maxKey = key;
                }
            }
            genresOrder.add(maxKey);
            map.remove(maxKey);
        }

        ArrayList<Music> result = new ArrayList<>();
        for (String order : genresOrder) {
            ArrayList<Music> musicArrayList = new ArrayList<>();
            for (int i = 0; i < genres.length ; i++) {
                if(genres[i].equals(order)) {
                    musicArrayList.add(new Music(i, genres[i], plays[i]));
                }
            }
            Collections.sort(musicArrayList);
            result.add(musicArrayList.get(0));
            if (musicArrayList.size() > 1) {
                result.add(musicArrayList.get(1));
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0 ; i < result.size() ; i++) answer[i] = result.get(i).idx;

        return answer;
    }

    private static class Music implements Comparable<Music>{

        int idx;
        String genre;
        int play;

        public Music(int idx, String genre, int play) {
            this.idx = idx;
            this.genre = genre;
            this.play = play;
        }

        @Override
        public int compareTo(Music o) {
            if (o.play == this.play) {
                return this.idx -  o.idx;
            }
            return o.play - this.play;
        }
    }
}
