import java.util.*;

public class Main {

    static long[] memo;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        memo = new long[n + 1];

        System.out.println(fibonacci(n));

    }

    private static long fibonacci(int n) {

        if (n <= 3) {
            return 1;
        }else if(memo[n] != 0){
            return memo[n];
        }else{
            return memo[n] = fibonacci(n-1) + fibonacci(n-3);
        }

    }

}