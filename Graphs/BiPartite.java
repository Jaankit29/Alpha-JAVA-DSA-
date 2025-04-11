import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class Edge{
    int src; 
    int des;

    Edge(int s, int d){
        this.src=s;
        this.des=d;
    }
}

public class BiPartite {
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge>[] graph=new ArrayList[V];

        for(int i=0; i<V; i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
       // graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

       // graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));

        System.out.println(isBipartite(graph));


    }

    public static boolean isBipartite(ArrayList<Edge>[] G){
        int[] col=new int[G.length];

        for(int i=0; i<col.length; i++){
            col[i]=-1;
        }

        Queue<Integer> q= new LinkedList<>();

        for(int i=0; i<G.length; i++){
            if (col[i]==-1) {
                q.add(i);
                col[i]=0;
                while (!q.isEmpty()) {
                    int cur=q.remove();
                    
                    for(int j=0; j<G[cur].size(); j++){
                        Edge e=G[cur].get(j);
                        if(col[e.des]==-1){
                            col[e.des]= col[cur]==0?1:0;
                            q.add(e.des);
                        }
                        else if (col[cur]==col[e.des]) {
                            return false;
                        }
                    }
                    
                }
                
            }
        }

        return true;
    }
}
