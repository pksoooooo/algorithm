class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums2.length < nums1.length) {
            return intersection(nums2, nums1);
        }

        HashMap<Integer, Integer> num2Map = new HashMap<>();
        HashSet<Integer> resultSet = new HashSet<>();

        for (int num : nums2) {
            num2Map.put(num, num);
        }

        for (int num : nums1) {
            if (num2Map.get(num) != null) {
                resultSet.add(num);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(resultSet);
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}