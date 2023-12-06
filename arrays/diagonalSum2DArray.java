public class diagonalSum2DArray {
    public static int diagonalSum(int arr[][]){
        int sum = 0;
        int sumOfSecDiagonal = 0;
        /*  time O(n^2)
         for(int i = 0;i<arr.length;i++){
            
            //columns
            for(int j = 0;j<arr[0].length;j++){
               if(i==j){
                sum += arr[i][j];
               }
               if(i+j == arr.length - 1 && i!=j){
                sumOfSecDiagonal += arr[i][j];
               }
            }
           
        }
        return sum + sumOfSecDiagonal;
    }
    */
    
    for(int i = 0; i<arr.length; i++){
        //pd
        sum += arr[i][i];
        //sd
        if(i != arr.length - i - 1) 
        sum += arr[i][arr.length -1-i];
    }
    return sum;
    }
    
    public static void main(String[] args) {
        
        int arr[][] = { 
            {1,2,3},
            {4,5,6},
            {7,8,9},
        
        };
        int trace = diagonalSum(arr);
        System.out.println(trace);
    }
}
