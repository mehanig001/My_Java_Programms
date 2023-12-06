public class CallGuests {
    public static int wayToCallGuests(int n){
      
        if(n<2){
            return 1;
        }

        int singles = wayToCallGuests(n-1);
        int pairs = (n - 1) * wayToCallGuests(n-2);

        return singles + pairs;
    }
    public static void main(String[] args) {
        System.out.println((wayToCallGuests(4)));
        
    }
}
