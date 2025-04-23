class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int count = 0;
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (!isWithinDistance(arr1[i], arr2, d)) {
                count++;
            }

        }

        return count;

    }

    static boolean isWithinDistance(int n, int[] arr2, int d) {
        int left = 0;
        int right = arr2.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (Math.abs(n - arr2[mid]) <= d) {
                return true;
            } else if (arr2[mid] < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return false;

    }
}