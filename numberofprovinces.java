class Solution {
    static class Edge{
        int src;
        int dest;
        Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<Edge> graph[]=new ArrayList[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            graph[i]=new ArrayList<>();
        }
        //graph creation
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(isConnected[i][j]==1){
                   graph[i].add(new Edge(i,j));
                }
            }
        }
        int prov=0;
        boolean vist[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vist[i]){
                prov++;
                dfsUtil(graph, vist,i);
            }
        }
        return prov;

    }
    public static void dfsUtil(ArrayList<Edge> graph[],boolean vist[],int curr){ //O(V+E)
        //visit
        vist[curr]=true;
        //call for neighbours
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vist[e.dest]){
                dfsUtil(graph, vist, e.dest);
            }
        }
    }
}
