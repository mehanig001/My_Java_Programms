public class SearchInArray {
    public static boolean stairSearch(int arr[][], int key ){
        int row = arr.length - 1, col = 0;
        while(row >=0 && col <= arr[0].length){
            if(arr[row][col] == key){
                System.out.println("index are (" + row +"," + col + ")");
                return true;
            }
            else if(key<arr[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key Not Found");
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}};
            stairSearch(arr, 50);
        }
    }
    

