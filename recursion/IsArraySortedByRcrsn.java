public class IsArraySortedByRcrsn {
    public static void isSorted(int i, int arr[]){
        if(i == arr.length - 2 && arr[i+1]>arr[i]){
            System.out.println("yes");
            return ;

        }
        if(arr[i]>arr[i+1]){
            System.out.println("NO");
            return;
        }
        isSorted(i + 1, arr);
        

    }
    public static int firstOccurance(int arr[], int i, int key ){
        if(arr[i]  == key){
           return i;
        }
        if(i == arr.length - 1){
            return -1 ;
        }
        
        return firstOccurance(arr, i+1,key);
    }
    public static int lastOccurance(int arr[], int key ){
        int n = arr.length -1;
        if(arr[n]  == key){
           return n;
        }
        if(n == 0){
            return -1 ;
        }
        
        return lastOccurance(arr, key);
    }
    public static void main(String[] args) {
        int arr[] = {1,4,8,11,8};
        System.out.println( firstOccurance(arr, 0,8));
        System.out.println( lastOccurance(arr,8));
        isSorted(0, arr);
    }
}
