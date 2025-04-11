// import java.util.*;

// public class DFS {
    

//     // static class Edge{
//     //     int src;
//     //     int dest;

//     //  public Edge(int s, int d){
//     //     this.src=s;
//     //     this.dest=d;
//     //  }
//     // }
//     static class Edge{
//       int src;
//       int dest;
//      // int wt;

//       Edge (int s, int d){
//         this.dest=d;
//         this.src=s;
//        // this.wt=w;
//       }
//     }
//     //   1 ---------3
//     //  /           | \              
//     // 0            |  5 -- 6
//     //  \           | /
//     //   2----------4 


//     public static void main(String[] args) {
//         int V=7;
//         ArrayList<Edge>[] graph= new ArrayList[V];
        
//        boolean vis[] =new boolean[graph.length];
      
//         for(int i=0; i<V; i++){
//             graph[i]= new ArrayList<>();
//         }
       
//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));

//         graph[1].add(new Edge(1, 3));
//         graph[1].add(new Edge(1, 0));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 4));

//         graph[3].add(new Edge(3, 1));
//         graph[3].add(new Edge(3, 4));
//         graph[3].add(new Edge(3, 5));
        

//         graph[4].add(new Edge(4, 2));
//         graph[4].add(new Edge(4, 3));
//         graph[4].add(new Edge(4, 5));

//         graph[5].add(new Edge(5, 3));
//         graph[5].add(new Edge(5, 4));
//         graph[5].add(new Edge(5, 6));

//         graph[6].add(new Edge(6, 5));

//       // dfs(graph, 0, vis);
//       dfs(graph, 0, vis);
//     }

//   //   public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis){

//   //     System.out.println(curr+" ");
//   //     vis[curr]=true;

//   //     for(int i=0; i<graph[curr].size(); i++){
//   //       Edge e= graph[curr].get(i);

//   //       if(!vis[e.dest]){
//   //           dfs(graph, e.dest, vis);

//   //       }
//   //     }
//   //   }
//   // }
    
//     public static void dfs(ArrayList<Edge>[] graph, int cur, boolean[] vis){

//       System.out.println(cur);
//       vis[cur]=true;

//       for(int i=0; i<graph[cur].size(); i++){
//         Edge e=graph[cur].get(i);

//         if(!vis[e.dest]){
//           dfs(graph, e.dest, vis);
//         }
//       }
//     }
// }

import java.util.ArrayList;



public class DFS {

  static class Edge{
    int src;
    int des;

    Edge(int s, int d){
      this.des=d;
      this.src=s;
    }
  }
//     //   1 ---------3
//     //  /           | \              
//     // 0            |  5 -- 6
//     //  \           | /
//     //   2----------4 
  public static void main(String[] args) {
    int V=13;
    ArrayList<Edge>[] graph=new ArrayList[V];

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
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));

        graph[7].add(new Edge(7, 8));

        graph[8].add(new Edge(8, 7));
        graph[8].add(new Edge(8, 9));

        graph[9].add(new Edge(9, 8));

        graph[10].add(new Edge(10, 11));

        graph[11].add(new Edge(11, 10));

        graph[12].add(new Edge(12, 12));

         
       
       ///System.out.println(hasPath(graph, 7, 11, vis));

        dfs(graph);

  }

  public static void dfs(ArrayList<Edge>[] G){
    boolean[] vis=new boolean[G.length];
    for(int i=0; i<G.length; i++){
      if(!vis[i]){
        dfsUtil(G, i, vis);
      }
    }
  }

  public static void dfsUtil(ArrayList<Edge>[] graph, int cur, boolean[] vis){
    System.out.println(cur);
    vis[cur]= true;

    for(int i=0; i< graph[cur].size(); i++){
      Edge e= graph[cur].get(i);

      if(!vis[e.des]){
        dfsUtil(graph, e.des, vis);
      }

    }
  }


  public static boolean hasPath(ArrayList<Edge>[] G, int s, int d, boolean[] vis){
      if(s==d) return true;

      vis[s]=true;

      for(int i=0; i<G[s].size(); i++){
        Edge e=G[s].get(i);
        if(!vis[e.des] && hasPath(G, e.des, d, vis)){
          return true;
        }
      }

    return false;
  }
}