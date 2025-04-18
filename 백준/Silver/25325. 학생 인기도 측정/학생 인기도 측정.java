import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        // 학생 이름들 순서대로 저장
        String[] names = sc.nextLine().split(" ");

        // 인기도 저장용 map
        Map<String, Integer> popularity = new HashMap<>();
        for (String name : names) {
            popularity.put(name, 0);
        }

        // 각 학생이 좋아하는 사람 정보 받아서 처리
        for (int i = 0; i < n; i++) {
            String[] liked = sc.nextLine().split(" ");
            for (String target : liked) {
                popularity.put(target, popularity.get(target) + 1);
            }
        }

        // 정렬: 인기도 내림차순, 같으면 이름 오름차순
        Arrays.sort(names, (a, b) -> {
            int cmp = Integer.compare(popularity.get(b), popularity.get(a));
            if (cmp == 0) {
                return a.compareTo(b);
            }
            return cmp;
        });

        for (String name : names) {
            System.out.println(name + " " + popularity.get(name));
        }
    }
}
