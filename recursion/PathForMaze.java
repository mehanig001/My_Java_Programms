public class PathForMaze {
    public static int pathForMaze(int i,int j,int n ,int m){
        if(i ==n|| j==m){
            return 0;
       }
        
        if(i==n-1 || j==m-1){
            return 1;
        }
        int rights = pathForMaze(i, j+1, n, m);
        int downs = pathForMaze(i+1, j, n, m);

        return rights + downs;

        
        
       
        
    }
    public static void main(String[] args) {
        System.out.println( pathForMaze(0, 0,3,04) );
    }
    
}
