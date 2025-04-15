import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char gameName = sc.next().charAt(0);

        Set<String> players = new HashSet<>();

        for (int i = 0; i < N; i++) {
            players.add(sc.next());
        }

        int size = players.size();

        int result = gameName == 'Y' ? size : gameName == 'F' ? size / 2 : size / 3;
        System.out.println(result);

    }

}