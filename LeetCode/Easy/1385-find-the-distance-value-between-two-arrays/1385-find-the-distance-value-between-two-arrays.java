class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        // if (arr2.length < arr1.length) {
        //     return findTheDistanceValue(arr2, arr1, d);
        // }

        Arrays.sort(arr2);
        int count = 0;
        for (int num : arr1) {
            if (!exist(num, arr2, d)) {
                count++;
            }
        }

        return count;
    }

    static boolean exist(int num, int[] arr2, int d) {

        int left = 0;
        int right = arr2.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (Math.abs(num - arr2[mid]) <= d) {
                return true;
            } else if (arr2[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}