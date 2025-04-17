import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<Integer, Integer> xCount = new HashMap<>();
        HashMap<Integer, Integer> yCount = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            xCount.put(x, xCount.getOrDefault(x, 0) + 1);
            yCount.put(y, yCount.getOrDefault(y, 0) + 1);

        }

        int count = 0;

        for(int x : xCount.values()){
            if(2 <= x){
                count++;
            }
            
        }

        for(int y : yCount.values()){
            if(2 <= y){
                count++;
            }
            
        }

        System.out.println(count);

    }

}