public class PlacingTile {
    public static int countWays(int n , int m  ){
        if(n == m){
            return 2;
          }
          if(n < m){
            return 1;
          }





        int horizontal = countWays(n-1, m);
        int vertical = countWays(n-m, m);






        return horizontal + vertical;
    }
    public static void main(String[] args) {
       System.out.println( countWays(4, 02) );
    }
}
