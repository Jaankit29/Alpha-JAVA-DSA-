import java.util.ArrayList;

public class Directed_Graph_Cycle {
    static class Edge{
        int src, des;
        Edge(int s, int d){
            this.src=s;
            this.des=d;
        }
    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge>[] graph=new ArrayList[V];

        for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));

        System.out.println(isCycle(graph));
        
    }

    public static boolean isCycle(ArrayList<Edge>[] G){  
        boolean vis[]= new boolean[G.length];
        boolean[] stack=new boolean[G.length];

        for(int i=0; i<G.length; i++){
            if(!vis[i]){
                if(isCycleUtil(G, i, vis, stack)){
                    return true;
                }
            }
        }
        return false;
    }
   
    public static boolean isCycleUtil(ArrayList<Edge>[] G, int cur, boolean[] vis, boolean[] stack){
        vis[cur]=true;
        stack[cur]=true;

        for(int i=0; i<G[cur].size(); i++){
            Edge e=G[cur].get(i);

            if(stack[e.des]){
                return true;
            }
            if(!vis[e.des] && isCycleUtil(G, e.des, vis, stack)){
                return true;
            }
        }
        stack[cur]=false;
        return false;
    }
} 