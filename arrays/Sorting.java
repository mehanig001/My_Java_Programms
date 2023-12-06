public class Sorting{
    public static void bubbleSort(int arr[]){
        // bubble sort means throw the largest in last 
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j < arr.length - i - 1;j++){
                if(arr[j]>arr[j+1]){
                    //swap                                 
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
      
        }
    }
    public static void selectionSort(int arr[]){
        //smallest aage rakhte chalo bhaiya;
        //5 4 1 3 2
        for(int i=0; i<arr.length-1; i++){
            int smallestAtIdx = i;
            for(int j = i+1; j<arr.length; j++){
            if(arr[smallestAtIdx]>arr[j]){
                smallestAtIdx = j;
            }
                    
        }
            int temp = arr[i];
            arr[i] = arr[smallestAtIdx];
            arr[smallestAtIdx] = temp;

        }
    }
    public static void insertionSort(int arr[]){
        // 5 4 1 3 2
        // insertion = sorted + unsorted  [isme piche check krna pdta hai]
        for(int i = 1;i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
           while(prev>=0 && arr[prev]>curr){
          
            arr[prev + 1] = arr[prev];
            prev--;
           }
           arr[prev+1] = curr;
        }
    }
    public static void printArray(int arr[]){
        for( int k = 0;k<arr.length; k++){
            System.out.print(arr[k] + " ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int length[] = {5,-1,9,4,8,14,0};
        insertionSort(length);
        printArray(length);
    }
      
}