//  나머지 합

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        long[] S = new long[N];
        long[] C = new long[M];

        S[0] = sc.nextInt();
        long answer = 0;

        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int reminder = (int) (S[i] % M);
            if (reminder == 0) answer++;

            C[reminder]++;

        }

        for (int i = 0; i < M; i++) {
            if (C[i] > 1) {
                answer = answer + (C[i] * (C[i] - 1) / 2);
            }
        }

        System.out.println(answer);


    }
}