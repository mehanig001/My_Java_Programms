public class OptimizedBubbleSort {
    public static void bubbleSortOpt(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            boolean Swapped = false;
            for (int j = 0; j < arr.length - 1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    Swapped = true;
                }
            }
            if(Swapped = false){
                break;
            }
        }

    }
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2,8,6,2,1};
        bubbleSortOpt(arr);
        printArr(arr);
    }
    
}
