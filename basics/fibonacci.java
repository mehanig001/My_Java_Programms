public class fibonacci {
    public static void main(String[] args) {
        int n =5;
        //the sum of 2 pev no.
        int i = 0;
        int j = 1;
        int sum = i + j;
        System.out.print("0 1 1 ");
        for(int k = 1;k<=n-3;k++){
            i = j;
            j = sum;
            sum = i + j;
            
            System.out.print(sum + " ");
        }
     
 
    }
}
