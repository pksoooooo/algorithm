import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char gameName = sc.next().charAt(0);
        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(sc.next());
        }

        int result = gameName == 'Y' ? set.size() : gameName == 'F' ? set.size() / 2 : set.size() / 3;
        System.out.println(result);

    }

}