public class recursion1 {
    public static void printList(int n){
        if(n == 0){
            return;
        }
        int sum = 0;
        System.out.println(sum);
        printList(n-1);
        sum = sum + n;
        
        
    }
    public static void main(String[] args) {
        printList(4);
    }
}
