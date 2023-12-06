public class SortsPractise{
    public static void bubbleSort(int arr[]){
        //bubble throw largest in last
        for(int i =0; i<arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;

                }
            }
        } 

    }
    public static void selectionSort(int arr[]){
        //minposition me leke swap the smallest;
        for(int i = 0; i < arr.length; i++){
            int minpos = i;
            for(int j = i; j<arr.length; j++){
                if(arr[j]<arr[minpos]){
                    minpos = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
    }
    public static void insertionSort(int arr[]){ 
        //4 1 5 3 2  1
        for(int i = 1; i < arr.length; i++){
            int prev = i-1;
            int curr = arr[i];
            while(prev>=0 && arr[prev]>curr){
                arr[prev + 1] = arr[prev];
                prev--;
        
            }
            arr[prev+1] = curr;
        }
    }
    public static void printArray(int arr[] ){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int marks[] = {5,4,1,3,2};
        insertionSort(marks);
        printArray(marks);
    }
    
}