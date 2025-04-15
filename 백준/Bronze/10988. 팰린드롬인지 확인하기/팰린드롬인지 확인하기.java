import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String pelindrom = br.readLine();

        int reverseOrder = pelindrom.length() - 1;
        int result = 1;
        for (int i = 0; i < pelindrom.length(); i++) {
            if (pelindrom.charAt(i) != pelindrom.charAt(reverseOrder--)) {

                result = 0;
                break;

            }
        }

        System.out.println(result);
    }

}