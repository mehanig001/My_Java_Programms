public class BinaryStringsNoConsOnes {
    public static void binStrings(int n, String newstr, int last){
        if (n == 0) {
            System.out.println(newstr);
            return;
        }
        //work
        //lasstplace is 0
        binStrings(n-1, newstr+'0',0 );
       if(last == 0){
        binStrings(n-1, newstr+'1',1 );
       }
    }
    public static void main(String[] args) {
        binStrings(3, "",0);
    }
}
