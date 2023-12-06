public class SudokuSolver {
    public static void printSudoku(int arr[][]){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j<9; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            
        }
    }
    public static boolean sudokuSol(int arr[][], int row, int col){
        //baseCase
        if(row == 9){
            return true;
        }
        //rcrsn
        int nxtrow = 0;
        int nxtcol = 0;
        if(col + 1 == 9){
            nxtrow = row + 1;
            nxtcol = 0;

        }
        else {
            nxtrow = row;
            nxtcol = col + 1;
        }
        if(arr[row][col]!=0){
            return sudokuSol(arr, nxtrow, nxtcol);
        }
        else{
        for(int digit = 1; digit <= 9; digit ++){
            if(isSafe(arr,row,col,digit)){
                arr[row][col] = digit;
                if(sudokuSol(arr, nxtrow, nxtcol)){
                    //sol exist
                    return true;
                }
                arr[row][col] = 0;
            }
        }
    }
        return false;
    }
    public static boolean isSafe(int arr[][], int row, int col, int digit){
        //for column  safety col fixed
        for(int i = 0; i <= 8; i++){
            if(arr[i][col] == digit){
                return false;
            }
        }
            // for row safety row fixed
            for(int j = 0; j <= 8; j++){
                if(arr[row][j] == digit){
                    return false;
                }
            }
            // for square 3*3 grid
            int sr = (row/3) * 3;
            int sc = (col/3) * 3;
            for(int i = sr; i< sr + 3; i++){
                for(int j = sc; j< sc + 3; j++){
                    if(arr[i][j] == digit){
                        return false;       
                    }
                }
        }
        return true;
    }
    public static void main(String[] args) {
        int sud[][] = {
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
        };
        if(sudokuSol(sud, 0, 0)){
            System.out.println("Sol exists");
            printSudoku(sud);
        }
        else{
            System.out.println("NO");
        }
    }
    
}
