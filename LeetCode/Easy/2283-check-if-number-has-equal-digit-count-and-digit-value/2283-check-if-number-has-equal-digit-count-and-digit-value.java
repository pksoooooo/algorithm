class Solution {
    public boolean digitCount(String num) {
        
        int[] digitCount = new int[11];

        for (char ch : num.toCharArray()) {
            digitCount[ch - '0']++; 
        }

        for(int i = 0; i < num.length(); i++){
            int count = num.charAt(i) - '0';
            if(digitCount[i] != count){
                return false;
            }
        }

        return true;
        
    }
}