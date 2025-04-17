import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        HashMap<String, Integer> requestSubject = new HashMap<>();
        HashMap<String, Integer> mySubject = new HashMap<>();

        for (int i = 0; i < N; i++) {
            requestSubject.put(sc.next(), sc.nextInt());
        }

        for (int i = 0; i < K; i++) {
            String subject = sc.next();
            mySubject.put(subject, requestSubject.get(subject));
            requestSubject.remove(subject);
        }

        List<String> keySet = new ArrayList<>(requestSubject.keySet());

        keySet.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return requestSubject.get(o1).compareTo(requestSubject.get(o2));
            }
        });

        int result = 0;
        for (int score : mySubject.values()) {
            result += score;
        }

        int min = result;
        int max = result;
        for (int i = 0; i < (M - K); i++) {
            min += requestSubject.get(keySet.get(i));
            max += requestSubject.get(keySet.get(keySet.size() - 1 - i));
        }

        System.out.println(min + " " + max);

    }

}