public class back {
    public static void printArr(int arr[]) {
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }
    public static void backs(int val, int i, int arr[]) {
        //baseCase
        if(i == arr.length ){
            printArr(arr);
            return  ;
        }
        //kaam
        
        arr[i] = val; //jate time

        backs(val + 1, i +1,arr);  //rec

        arr[i] = arr[i] - 2; //wapas time
        return ;
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        backs(1, 0, arr);
        printArr(arr);
        
    }
    
}
