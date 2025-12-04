import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);
        // System.out.println(Arrays.toString(A));
        int count = 0;

        for (int i = 0; i < N; i++) {

            int target = A[i];
            int startIdx = 0;
            int endIdx = N - 1;

            while (startIdx < endIdx) {
                int sum = A[startIdx] + A[endIdx];
                if (target == sum) {
                    if (startIdx != i && endIdx != i) {
                        count++;
                        break;
                    } else if (startIdx == i) {
                        startIdx++;
                    } else if (endIdx == i) {
                        endIdx--;
                    }
                } else if (sum < target) {
                    startIdx++;
                } else {
                    endIdx--;
                }
            }

        }

        System.out.println(count);
    }
}