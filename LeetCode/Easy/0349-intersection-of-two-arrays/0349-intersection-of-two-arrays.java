class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        if (nums2.length < nums1.length) {
            return intersection(nums2, nums1);
        }

        Arrays.sort(nums2);
        Set<Integer> resultSet = new HashSet<>();

        for (int num1 : nums1) {

            int left = 0;
            int right = nums2.length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (nums2[mid] == num1) {
                    resultSet.add(nums2[mid]);
                    break;
                    
                } else if (nums2[mid] < num1) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }
        int[] resultArr = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            resultArr[i++] = num;
        }

        return resultArr;

    }
}