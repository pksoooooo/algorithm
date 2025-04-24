import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);  // 오름차순 정렬

        for (int i = 0; i < M; i++) {
            int question = sc.nextInt();
            int index = lowerBound(nums, question);

            // index가 배열 범위 내고, 해당 위치의 값이 question과 같다면 출력
            if (index < N && nums[index] == question) {
                System.out.println(index);
            } else {
                System.out.println(-1);
            }
        }
    }

    // lowerBound: 배열에서 target보다 크거나 같은 가장 왼쪽 인덱스를 반환
    public static int lowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;  // right는 미포함 (열린 구간)

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;  // arr[mid] >= target
            }
        }

        return left;
    }
}