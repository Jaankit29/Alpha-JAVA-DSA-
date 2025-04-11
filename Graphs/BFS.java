

import java.util.*;

public class BFS {
    
    static class Edge{
        int src;
        int dest;

     public Edge(int s, int d){ //constructor
        this.src=s;
        this.dest=d;
     }
    }
    //   1 ---------3
    //  /           | \              
    // 0            |  5 -- 6
    //  \           | /
    //   2----------4 

    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge>[] graph= new ArrayList[V];

        for(int i=0; i<V; i++){
            graph[i]= new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 5));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));

        bfs(graph);
    }

    public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> q= new LinkedList<>();
        boolean vis[] =new boolean[graph.length];

        q.add(0); //source

        while (!q.isEmpty()) {
            int curr= q.remove();

            if(!vis[curr]){  // (!vis[curr])
               System.out.println(curr+" ");
               vis[curr]=true;

               for(int i=0; i<graph[curr].size(); i++){
                Edge e= graph[curr].get(i);
                q.add(e.dest);

               }
            }
        }
    }
}

  