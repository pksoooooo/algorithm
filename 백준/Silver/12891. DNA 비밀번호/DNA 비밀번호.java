import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {

    static int checkPassword;
    static int[] myArr;
    static int[] checkArr;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int P = sc.nextInt();
        String dna = sc.next();
        char[] dnaArr = dna.toCharArray();

        int count = 0;

        checkPassword = 0;
        myArr = new int[4];
        checkArr = new int[4];

        for (int i = 0; i < 4; i++) {
            checkArr[i] = sc.nextInt();
            if (checkArr[i] == 0) {
                checkPassword++;
            }
        }

        for (int i = 0; i < P; i++) {
            add(dnaArr[i]);
        }

        if (checkPassword == 4) {
            count++;
        }

        for (int endIdx = P; endIdx < S; endIdx++) {
            int startIdx = endIdx - P;
            add(dnaArr[endIdx]);
            remove(dnaArr[startIdx]);

            if (checkPassword == 4) {
                count++;
            }
        }

        System.out.println(count);

    }

    private static void remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0]) {
                    checkPassword--;
                }
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) {
                    checkPassword--;
                }
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) {
                    checkPassword--;
                }
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) {
                    checkPassword--;
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
                    checkPassword++;
                }
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) {
                    checkPassword++;
                }
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) {
                    checkPassword++;
                }
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) {
                    checkPassword++;
                }
                break;
        }
    }

}