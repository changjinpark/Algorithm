import java.util.HashMap;

public class SamePrefix {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(solution(phone_book));
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String, Integer> phoneMap = new HashMap<>();

        for(int i = 0; i < phone_book.length; i++) {
            phoneMap.put(phone_book[i], i);
        }

        for (String phone : phone_book) {
            for (int j = 1; j < phone.length(); j++) {
                if (phoneMap.containsKey(phone.substring(0, j))) {
                    answer = false;
                    return answer;
                }
            }
        }

        return answer;
    }
}
