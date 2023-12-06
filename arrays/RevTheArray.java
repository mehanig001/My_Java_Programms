public class RevTheArray {
    public static void revTheArray(int arr[]){

        //Time is O(n/2) == O(n)
        // Space complexity dec because new array is not formed
        
        int first = 0;
        int last = arr.length - 1;
        while(first<last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
           

        }
    }
    public static void main(String[] args) {
        int num[] = {2,4,5,56,67,859};
        revTheArray(num);
        for(int i = 0 ; i < num.length;i++){
            System.out.print(num[i] + " ");
        }
        System.out.println(); 
        
    }
}
