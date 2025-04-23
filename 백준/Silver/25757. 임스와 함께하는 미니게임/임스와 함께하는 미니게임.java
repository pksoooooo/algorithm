import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char playGame = sc.next().charAt(0);
        Set<String> players = new HashSet<>();

        for (int i = 0; i < N; i++) {
            players.add(sc.next());
        }

        int playersSize = players.size();

        System.out.println(playGame == 'Y' ? playersSize : playGame == 'F' ? playersSize / 2 : playersSize / 3);

    }

}