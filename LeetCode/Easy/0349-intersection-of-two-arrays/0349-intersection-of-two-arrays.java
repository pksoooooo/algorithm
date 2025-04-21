class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        if(nums1.length > nums2.length){
            return intersection(nums2, nums1);
        }

        Set<Integer> num1Set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for(int num : nums1){
            num1Set.add(num);
        }

        for(int num : nums2){
            if(num1Set.contains(num)){
                resultSet.add(num);
            }
        }

        int[] result = new int[resultSet.size()];

        int count = 0;
        for(int num : resultSet){
            result[count++] = num;
        }

        return result;
        
    }
}