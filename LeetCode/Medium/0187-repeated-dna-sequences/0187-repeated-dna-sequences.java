class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        ArrayList<String> resultList = new ArrayList<>();
        Set<String> tempSet = new HashSet<>();
        int length = s.length();

        for(int i = 0; i <= length - 10; i++) {
            String str = s.substring(i, i + 10);
            if(!tempSet.add(str) && !resultList.contains(str)){
                resultList.add(str);
            }
        }

        return resultList;
        
    }
}