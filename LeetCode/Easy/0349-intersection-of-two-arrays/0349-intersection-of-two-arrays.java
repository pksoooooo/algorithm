class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> num1Set = new HashMap<>();
        HashMap<Integer, Integer> num2Set = new HashMap<>();
        HashMap<Integer, Integer> resultSet = new HashMap<>();

        for(int num : nums1){
            num1Set.put(num, num);
        }

        for(int num : nums2){
            num2Set.put(num, num);
        }

        for(int num : num2Set.values()){
            if(num1Set.get(num) != null){
                resultSet.put(num, num);
            }
        }

        int[] result = new int[resultSet.size()];

        int count = 0;
        for(int num : resultSet.values()){
            result[count++] = resultSet.get(num);
        }

        return result;
        
    }
}