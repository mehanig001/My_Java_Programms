public class repeatUsingRec {
    public static int rep(int n){
        int k = rep(n);
        
        return n;
    }
    public static void main(String[] args) {
        rep(10);
    }
}
