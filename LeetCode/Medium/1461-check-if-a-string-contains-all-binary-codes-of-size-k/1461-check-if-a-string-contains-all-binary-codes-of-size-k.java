class Solution {
    public boolean hasAllCodes(String s, int k) {

        int bitTotal = 1 << k;
        Set<String> result = new HashSet<>(); 
        for(int i = 0; i <= s.length() - k; i++){
            result.add(s.substring(i, i + k));
            if(result.size() == bitTotal){
                return true;
            }
        }

        return false;
        
    }
}