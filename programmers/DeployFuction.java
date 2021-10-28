import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DeployFuction {
    public static void main(String[] args) {
        solution(new int[] {93, 30, 55}, new int[] {1, 30, 1});
    }

    private static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answerList = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0 ; i < progresses.length ; i++){
            int remainDays = (int) Math.ceil((double)(100 - progresses[i]) / speeds[i]);
            if(!queue.isEmpty() && (queue.peek() < remainDays)) {
                answerList.add(queue.size());
                queue.clear();
            }
            queue.offer(remainDays);
        }
        answerList.add(queue.size());

        int[] answer = new int[answerList.size()];
        for (int i = 0 ; i < answerList.size() ; i++) answer[i] = answerList.get(i);
        return answer;
    }
}
