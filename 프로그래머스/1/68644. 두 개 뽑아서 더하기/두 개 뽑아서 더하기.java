import java.util.ArrayList;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
        
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(i != j){ 
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }
        list = list.stream().distinct().sorted().collect(Collectors.toCollection(ArrayList::new));
        
        int[] answer = new int[list.size()]; 
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
    
        
        return answer;
    }
}