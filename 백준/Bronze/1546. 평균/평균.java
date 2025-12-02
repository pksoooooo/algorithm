import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double[] score = new double[N];

        int max = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){

            score[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, (int) score[i]);

        }

        double result = 0;
        for(double a : score){
            result = result + (a/max*100);
        }

        System.out.println(result / N);

    }
}