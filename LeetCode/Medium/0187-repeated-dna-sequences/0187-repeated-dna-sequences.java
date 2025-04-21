class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> unique = new HashSet<>();
        Set<String> result = new HashSet<>();
        int length = s.length();

        for(int i = 0; i <= length - 10; i++ ){
            String str = s.substring(i, i + 10);
            if(!unique.add(str)){
                result.add(str);
            }
        }

        return new ArrayList<>(result);
        
    }
}