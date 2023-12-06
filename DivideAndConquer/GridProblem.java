public class GridProblem {
    // TIME COMPLEXITY is O(2^[pow](m + n))    m right and n down 
    public static int grids(int i, int j, int row, int col){
        if(i == row - 1 && j == col - 1){
            return 1;
        }
        else if(row == i || col == j){
            return 0;
        }
        //kaam
        int t1 = grids(i + 1, j, row, col );  // right
        int t2 = grids(i, j + 1, row , col );  // 
        
        return t1 + t2;

    }
    public static void main(String[] args) {
        
        System.out.println( grids(0,0,3,3) );
    }
    
}


// kyuki expo time complexity kharaab hai ham direct DDDRRR ko permutr krke no of ways linear tome complexity me nikal sakte hai by ((n-1 + m-1)!/(n-1)!(m - 1)!)