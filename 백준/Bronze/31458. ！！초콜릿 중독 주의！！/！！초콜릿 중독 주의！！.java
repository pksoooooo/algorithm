import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String word = sc.next();
            int count = 0;
            int num = 0;
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);

                if (Character.isDigit(ch)) {
                    num = ch - '0';
                    if (j < word.length() && j != word.length() - 1) {
                        num = 1;
                        break;
                    }
                } else {
                    count++;
                }
            }

            if (count > 0) {
                if (count % 2 == 1) {
                    if (num == 1) {
                        num = 0;
                    } else {
                        num = 1;
                    }
                }
            }

            System.out.println(num);

        }

    }

}