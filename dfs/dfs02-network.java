class Solution {
    public int solution(int n, int[][] computers) {
        
        boolean[] visited = new boolean[n];
        int count = 0;
        
        for(int i = 0 ; i < n; i++){
            if(visited[i] == false){
                dfs(computers, visited, n, i);
                count++;
            }
        }
        return count;
    }
    
    public static void dfs(int[][] computers, boolean[] visited, int n, int i){

        visited[i] = true;
        
        for(int j = 1; j < n; j++){
            if(computers[i][j] == 1 && visited[j] == false){
                dfs(computers, visited, n, j);
            }
        }
    }
}
