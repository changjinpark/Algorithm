import java.util.*;

public class PrinterPriority {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        System.out.println(solution(priorities, location));
    }

    private static int solution(int[] priorities, int location) {
        Queue<Printer> q = new LinkedList<>();
        int answer = 0;
        for (int i = 0 ; i < priorities.length ; i++) {
            q.offer(new Printer(i , priorities[i]));
        }

        while (!q.isEmpty()) {
            Printer current = q.poll();
            boolean flag = false;
            for (Printer printer: q) {
                if (printer.priority > current.priority) {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                q.offer(current);
            }
            else {
                answer++;
                if(current.idx == location) return answer;
            }

        }

        return -1;
    }

    private static class Printer{
        int idx;
        int priority;

        public Printer(int idx, int priority) {
            this.idx = idx;
            this.priority = priority;
        }
    }
}
