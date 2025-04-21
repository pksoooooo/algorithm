import java.util.*;

class Main {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();

        graph = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {

            int node = sc.nextInt();
            int link = sc.nextInt();

            graph[node].add(link);
            graph[link].add(node);

        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }
        visited = new boolean[N + 1];
        DFS(V);
        System.out.println();
        visited = new boolean[N + 1];
        BFS(V);

    }

    static void DFS(int x) {

        if (visited[x]) {
            return;
        }
        visited[x] = true;
        System.out.print(x + " ");

        for (int i : graph[x]) {
            if (!visited[i]) {
                DFS(i);
            }
        }

    }

    static void BFS(int x) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        visited[x] = true;

        while(!queue.isEmpty()){
            int curX = queue.poll();
            System.out.print(curX + " ");
            for(int i : graph[curX]){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

    }

}
