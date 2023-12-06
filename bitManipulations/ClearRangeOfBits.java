public class ClearRangeOfBits {
    public static void main(String[] args) {
        int n = 31; // 11111
        int i = 1;    // to get 10001
        int j = 3;
        int a = (~1)<<(j);  //-1 = ~0 = 111111111111
        int b = ~((~1)<<(i-1));
        int x = (a|b)&n;
        System.out.println(x);

        // to check pow of 2 or not we know n & (n-1) == 0 for exact pow of 2 ex:- 8-1000 and 7-0111 
    }
}
