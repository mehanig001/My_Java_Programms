public class test {
    
    public static void main(String[] args) {
        //1 2 3 * 1 2 3
        //1 2 * * * 1 2
        //1 * * * * * 1
        for (int i = 1; i <= 4; i++) {
            for(int j = 4; j>i; j--){
                System.out.print(" ");
            }
            for( int j = 1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for(int j = 4; j>i; j--){
                System.out.print(" ");
            }
            for( int j = 1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
