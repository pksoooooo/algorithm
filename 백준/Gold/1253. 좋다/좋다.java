import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        // 배열에 담는다.
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // 배열을 오름 차순 으로 정렬 한다.
        Arrays.sort(A);

        int count = 0;

        for (int targetIdx = 0; targetIdx < N; targetIdx++) {

            // 타겟 값 기준으로 초기 변수 초기회
            int target = A[targetIdx];
            int startIdx = 0;
            int endIdx = N - 1;

            while (startIdx < endIdx) {

                // sum 변수 지정
                int sum = A[startIdx] + A[endIdx];

                if (sum == target) {
                    // 찾을 idx와 tartget idx가 같지 않아야 한다.
                    if (startIdx != targetIdx && endIdx != targetIdx) {
                        count++;
                        break;
                        // 같다면 start up
                    } else if (startIdx == targetIdx) {
                        startIdx++;
                        // 같다면 end dowm
                    } else if (endIdx == targetIdx) {
                        endIdx--;
                    }

                } else if (sum < target) { // sum이 작으면 startIdx up
                    startIdx++;
                } else { // sum이 크면 endIdx down;
                    endIdx--;
                }
            }
        }

        System.out.println(count);

    }
}