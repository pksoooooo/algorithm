import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = 0;

        int[] arr = new int[N];

        // 재료를 배열에 담는다

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 두가지 조합에서 M이랑 같은 값을 찾아서 count를 증가 시킨다.
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] + arr[j] == M) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}