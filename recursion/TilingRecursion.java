public class TilingRecursion {
    // floor is of 2 * n

    public static int waysOfTiling(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int ways = 0;
        int hor = waysOfTiling(n-1);
        int ver = waysOfTiling(n-2);
        ways = hor + ver;
        return ways;
    }
    public static void main(String[] args) {
        System.out.println(waysOfTiling(3));
        
    }
}
