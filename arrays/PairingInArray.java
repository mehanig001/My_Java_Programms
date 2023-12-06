public class PairingInArray {
    public static void pairingInArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            int currElement = arr[i];
            for(int j = i+1; j<arr.length; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
       

        }    
              // total no of pairs
              int tp = arr.length*(arr.length-1)/2;
              System.out.println("Total no of pairs = " + tp);

              //time complexity (n ka square) 
    }
    public static void main(String[] args) {
        int elements[] = {11,2,3,4,5};
        pairingInArray(elements);
       
    }
    
}
