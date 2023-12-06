

public class Sorts {
    public static void printArray(int arr[]){
        for (int index = 0; index < arr.length; index++) {
            
                System.out.print(arr[index] + " ");
            
        }
    }
    public static void bubble(int arr[]){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }
    public static void selectionSort(int arr[]){
        //1n2n6n7n4n5
        for(int i = 0; i<arr.length-1; i++){
            int smallest = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }
    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while (prev >= 0 && arr[prev] > curr) {  // prev i se 0 and arr prev >curr
                System.out.println(arr[prev + 1] + "is ki jgh" + arr[prev]);
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,6,7,4,5};
        
        insertionSort(arr);
        printArray(arr);
    }
}
