class Solution {
    public void dfs(int city, int[][] isConnected, int[] visited) {
        int n = isConnected.length;
        visited[city] = 1;
        for (int j = 0; j < n; j++) {
            if (isConnected[city][j] == 1 && visited[j] == 0) { 
                dfs(j, isConnected, visited);
            }
        }
    }
    
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int provinces = 0;
        int[] visited = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                provinces++;
                dfs(i, isConnected, visited);
            }
        }
        return provinces;
    }
}



// class Solution {
//     public int findCircleNum(int[][] isConnected) {
//         //bfs
//         int n=isConnected.length;
//         boolean [] visited=new boolean[n];
//         int provinces=0;
//         for(int i=0;i<n;i++){
//             if(visited[i]==false){
//                 provinces++;
//                 Queue<Integer> q=new LinkedList<>();
//                 q.add(i);
//                 visited[i]=true;
//                 while(!q.isEmpty()){
//                     int city=q.poll();
//                     for(int j=0;j<n;j++){
//                         if(isConnected[city][j]==1 && visited[j]==false){
//                             visited[j]=true;
//                             q.add(j);
//                         }
//                     }
//                 }
//             }
//         }
//         return provinces;
//     }
// }