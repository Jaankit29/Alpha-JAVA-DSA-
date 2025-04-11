import java.util.*;

public class CycleDetection {

    static class Edge {
        int src, des;
        Edge(int s, int d) {
            this.src = s;
            this.des = d;
        }
    }

    public static void main(String[] args) {
        int V = 13;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Constructing the graph
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
      //  graph[3].add(new Edge(3, 4));  // Removed
      //  graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
      //  graph[4].add(new Edge(4, 3));  // Removed
        graph[4].add(new Edge(4, 5));

      //  graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));

        graph[7].add(new Edge(7, 8));

        graph[8].add(new Edge(8, 7));
        graph[8].add(new Edge(8, 9));

        graph[9].add(new Edge(9, 8));

        graph[10].add(new Edge(10, 11));

        graph[11].add(new Edge(11, 10));

      // graph[12].add(new Edge(12, 12)); // Self-loop (cycle)
       System.out.println(detect(graph, V));

       
    }

    public static boolean detect(ArrayList<Edge>[] G, int V) {
        boolean[] vis=new boolean[V];

        for(int i=0; i<G.length; i++){
            if(!vis[i]){
                if(detectUtil(G, i, -1, vis)){
                    return true;
                }
            }

        }
        
        return false;
    }


    public static boolean detectUtil(ArrayList<Edge>[] G, int cur, int par, boolean[] vis) {
        vis[cur]=true;
        
        for(int i=0; i<G[cur].size(); i++){
            Edge e=G[cur].get(i);

            if(!vis[e.des]){
                if(detectUtil(G, e.des, cur, vis)  ){
                    return true;
                }
            }
            else if (vis[e.des] && e.des!=par) {
                return true;
            }
        }

        return false;
    }
}


