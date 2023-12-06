public class NQueen {
    static int count = 0;
    public static void printArr(char arr[][]) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            
        }
        System.out.println("_____CHESSBOARD___________");
    }

    public static boolean isSafe(char arr[][], int row, int col) {
        // ver up ------left diag --------- right diag---
        //ver up
        for(int i = row - 1; i >= 0; i--){
            if(arr[i][col] == 'Q'){
                return false;
            }
        }
        //left diagonal up
        for(int i = row - 1,j = col - 1; i >=0 && j>=0; i--, j--){
            if(arr[i][j] == 'Q'){
                return false;
            }
        }
        // right diagonal 
        for(int i = row - 1,j = col + 1; i >=0 && j < arr.length ; i--,j++){
            if(arr[i][j] == 'Q'){ 
                return false;
            }
        }
        return true;

    }

    public static boolean nQueen(char arr[][] , int row){
        //baseCase
        if(row == arr.length ){
            //printArr(arr);
            count ++;
            return true;
        }
        for(int col = 0; col < arr.length; col++){
            if (isSafe(arr, row, col) == true){
            arr[row][col] = 'Q';
            if(nQueen(arr, row + 1)) return true; //rec
            arr[row][col] = '*';   //backtrack
            }

        }
        return false;
    }
    
    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                board[i][j] = '*';
            }
        }
        if(nQueen(board,0)){
            System.out.println("Yes");
            printArr(board);
        }
        else{
            System.out.println("NO sol");
        }
        //System.out.println(count + " is the no of ways in which n Queens can be arrange in n*n ChessBoard");
        
    }
}
