import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();
        int result = Integer.MAX_VALUE;


        for (int i = 0; i < N; i++) {
            int S = sc.nextInt();
            int I = sc.nextInt();
            int C = sc.nextInt();
            

            for(int j = S; j < (I * C) + S; j += I){
                if(T == j){
                    System.out.println(0);
                    return;
                }if(T < j){
                    // System.out.println(j);
                    if(j - T < result){
                        result = j - T;
                    }
                    break;
                }
                
            }
        }

        if (result == Integer.MAX_VALUE) {
            System.out.println(-1); // 탈 수 있는 버스가 없을 때
        } else {
            System.out.println(result); // 최소 대기 시간 출력
        }

    

    }

}