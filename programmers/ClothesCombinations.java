import java.util.HashMap;

public class ClothesCombinations {
    public static void main(String[] args) {
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }

    private static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> clothesMap = new HashMap<>();
        for(String[] c : clothes) {
            clothesMap.put(c[1], clothesMap.getOrDefault(c[1], 0) + 1);
        }
        for (Integer value : clothesMap.values()) {
            answer *= (value + 1);
        }
        answer-=1;
        return answer;
    }
}
