class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        int length = s.length();

        for(int i = 0; i <= length - 10; i++ ){
            String str = s.substring(i, i + 10);
            if(!set.add(str) && !list.contains(str)){
                list.add(str);
            }
        }

        return list;
        
    }
}