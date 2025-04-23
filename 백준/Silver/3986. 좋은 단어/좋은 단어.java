import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = sc.next();
            Stack<Character> stack = new Stack<>();
            stack.push(word.charAt(0));
            for (int j = 1; j < word.length(); j++) {
                if (!stack.isEmpty() && stack.peek() == word.charAt(j)) {
                    stack.pop();
                } else {
                    stack.push(word.charAt(j));
                }

            }
            if (stack.isEmpty()) {
                count++;
            }

        }

        System.out.println(count);

    }

}