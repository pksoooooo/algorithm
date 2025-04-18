class Solution {
    public boolean hasAllCodes(String s, int k) {

        int bitTotal = 1 << k;

        Set<String> set = new HashSet<>();

        for(int i = 0; i <= s.length() - k; i++){
            String substr = s.substring(i, i + k);
            set.add(substr);
            if(set.size() == bitTotal){
                return true;
            }

        }

        return false;

        
    }
}