public class news {
    public static void printArray(int arr[]){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        //bubble
        int arr[] = {7,8,9,4,3,1};
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArray(arr);


        
    }
    
}
