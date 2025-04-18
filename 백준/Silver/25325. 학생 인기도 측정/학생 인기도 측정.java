import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> students = new HashMap<>();

        String[] names = sc.nextLine().split(" ");
        for (String name : names) {
            students.put(name, 0);
        }

        for (int i = 0; i < n; i++) {
            String[] student = sc.nextLine().split(" ");
            for (String str : student) {
                if (!str.equals(names[i])) {
                    students.put(str, students.get(str) + 1);
                }

            }

        }

        ArrayList<String> list = new ArrayList<>(students.keySet());

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int cmp = students.get(s2).compareTo(students.get(s1));
                if (cmp != 0) {
                    return cmp;
                }
                return s1.compareTo(s2);

            }
        });

        for (String key : list) {
            System.out.println(key + " " + students.get(key));
        }

    }

}