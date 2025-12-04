import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        int count = 0;
        int startIdx = 0;
        int endIdx = N - 1;

        while (startIdx < endIdx) {
            int sum = A[startIdx] + A[endIdx];
            if (sum == M) {
                count++;
                startIdx++;
                endIdx--;
            } else if (sum < M) {
                startIdx++;
            } else {
                endIdx--;
            }
        }

        System.out.println(count);

    }
}