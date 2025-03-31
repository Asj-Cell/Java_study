import java.util.ArrayDeque;
import java.util.Queue;

public class Test0 {


        public static void main(String[] args) {

            boolean result = solution("()()()))");
            System.out.println(result);
        }
        static boolean solution(String s) {
            Queue<Character> queue = new ArrayDeque<>();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    queue.offer('c');
                }else {
                    if (queue.isEmpty()) {
                        return false;
                    } else {
                        queue.poll();
                    }
                }
            }
            return queue.isEmpty();
        }


}
