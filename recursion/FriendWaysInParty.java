public class FriendWaysInParty {
    public static int ways(int n){
        int w = 0;
        if(n == 1 || n == 2){
            w+=n;
            return w;
        }
        //work
        w+= ways(n-1); //if single
        
        w = w +((n - 1) * ways(n-2) ); //if paired

        return w;
    }
    public static void main(String[] args) {
        System.out.println(ways(4 ));
    }
}
