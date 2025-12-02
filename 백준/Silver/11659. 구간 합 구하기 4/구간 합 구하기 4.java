import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] sumArr = new int[N+1];
        st = new StringTokenizer(br.readLine());
        
        sumArr[1] = Integer.parseInt(st.nextToken());
        for(int i = 2; i <= N; i++) { 
            sumArr[i] = sumArr[i-1] + Integer.parseInt(st.nextToken());
        }

        

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int first = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken());

            System.out.println(sumArr[last] - sumArr[first-1]);
            
            
        }



    }

}