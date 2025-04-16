import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;


class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N]; 

        for(int i = 0; i < N; i++){
            arr[i] = br.readLine();
        }

        quickSort(arr, 0, N-1);

        arr = Arrays.stream(arr)
                                   .distinct() // 중복 제거
                                   .toArray(String[]::new); // 배열로 변환

        
        for(String word : arr) System.out.println(word);

        
        
    

    }

    private static void quickSort(String[] arr, int left, int right) {

        int pl = left;
        int pr = right;
        String px = arr[(pl + pr) / 2];

        while(pl <= pr) {
            while(arr[pl].length() < px.length() || (arr[pl].length() == px.length() && arr[pl].compareTo(px) < 0)) pl++;
            while(arr[pr].length() > px.length() || (arr[pr].length() == px.length() && arr[pr].compareTo(px) > 0)) pr--;

            if(pl <= pr) {
                
                    swap(arr, pl++, pr--);

            }
        }

        if(left < pr)quickSort(arr, left, pr);
        if(pl < right)quickSort(arr, pl, right);

    }

    private static void swap(String[] arr, int idx1, int idx2) {
        String t = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = t;
    }

    

}