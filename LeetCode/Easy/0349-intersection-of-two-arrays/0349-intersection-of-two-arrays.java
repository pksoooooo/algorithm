class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> num1Set = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();

        for(int num : nums1){
            num1Set.add(num);
        }

        for(int num : nums2){
            if(num1Set.contains(num)){
                resultList.add(num);
                num1Set.remove(num);
            }
        }

        int[] result = new int[resultList.size()];

        for(int i = 0; i < resultList.size(); i++){
            result[i] = resultList.get(i);
        }

        return result;
        
    }
}