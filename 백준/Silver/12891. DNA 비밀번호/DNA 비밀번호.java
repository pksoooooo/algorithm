import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {

    static int[] checkArr;
    static int[] myArr;
    static int checkSecret;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int P = sc.nextInt();
        int count = 0;
        checkArr = new int[4];
        myArr = new int[4];
        checkSecret = 0;
        String DNA = sc.next();

        char[] A = DNA.toCharArray();

        for (int i = 0; i < 4; i++) {
            checkArr[i] = sc.nextInt();
            if (checkArr[i] == 0) {
                checkSecret++;
            }
        }

        for (int i = 0; i < P; i++) {
            add(A[i]);
        }

        if (checkSecret == 4) {
            count++;
        }

        for (int endIdx = P; endIdx < S; endIdx++) {
            int startIdx = endIdx - P;
            add(A[endIdx]);
            remove(A[startIdx]);
            if (checkSecret == 4) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static void remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0]) {
                    checkSecret--;
                }
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) {
                    checkSecret--;
                }
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) {
                    checkSecret--;
                }
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) {
                    checkSecret--;
                }
                myArr[3]--;
                break;

        }
    }

    private static void add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) {
                    checkSecret++;
                }
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) {
                    checkSecret++;
                }
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) {
                    checkSecret++;
                }
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) {
                    checkSecret++;
                }
                break;

        }
    }

}