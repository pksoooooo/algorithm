class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        List<String> resultList = new ArrayList<>();
        Set<String> tempSet = new HashSet<>();
        int length = s.length();
        
        if(length<11||length>10000) {
            return resultList;
        }
        
        for(int i = 0;  i <= length - 10; i++){
            String str = s.substring(i , i+10);
            if(!tempSet.add(str) && !resultList.contains(str)){
                resultList.add(str);
            }
        }
        
        return resultList;
        
    }
}