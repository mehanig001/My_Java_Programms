import javax.swing.SpinnerDateModel;

public class BitwiseOperator{
    public static void isEven(int n){
        if((n & 1) == (1)){
            System.out.println(n + " is odd ");
        }
        else System.out.println(n + " is even");
    }
    public static void getBit(int n,int i){
        //8 = 1000 i = 2
        System.out.println(i + "th element of " + n + " in  binary from last is = "+((n>>i) & 1)); 
    }
    public static void setBit(int n,int i,int wanted){
        //8 = 1000 i = 2 wanted = 1  implies //0010  or 1 impilies //0011  left shift 2 to 1100 or n ke sath
        if(wanted == 0){ 
            int x = n & (~(1<<i)); // 1 ka not krke given no ke sath and kr denge 111 to 110 
            System.out.println(n + " ke " + i + "th place pe  " + wanted + " lagane ke baad ye aya "+x);  
            
        } 
        else{
            int x = ( ((n>>i) | 1) << i ) | n;
            System.out.println(n + " ke " + i + "th place pe  " + wanted + " lagane ke baad ye aya "+x); // 12 = 1100 
         }   
    }
    public static void clearLast_i_bits(int n , int i) {
        //7->111   --> -1=11111111 -> 
            System.out.println("AFter clearing last " + i + "bits from  " + n + " Ans is = " + (n&((-1)<<i)));
            
    }
    public static void main(String[] args) {
        //5=101  6=110
        System.out.println("5&6 "+(5&6));
        System.out.println("5|6 " + (5|6));  //7=111
        //xor ^ bole to like = 0 and unlike = 1
        System.out.println("5^6 "+(5^6));  // 3=011
        //msb = most significant bit jisme ~(101) me 0000101 fir 1111010 fir 
        //0000101 + 1 = 0000110 (since bin 2 = 10 therefore 0 likha 1 carry )
        // fir ek negative sign kuki 2s complement tha n;

        System.out.println("~5 " + (~5)); // -6 = 100000000110
        // left shift << iska matbl if(5=000101)<<2 to 2 left wali kato aur last me 2 '0' laga do;
        //formula a<<b = a * 2^b
        System.out.println("left shift 5<<2 = " + (5<<2)); // 20 = 10100
        //right shift a>>2 = a/2^b isme right ke do kato shuru me 2 zero jod do (000101)
        System.out.println("right shift 6>>1 = "+(6>>1)); // 00110 = 00011(3ka)        

        isEven(5);
        getBit(4, 2);
        setBit(7, 04, 1); //23 = 10111  // 7 = 00111
        setBit(11, 1, 0); //11 = 1011   // 9 = 1001
        clearLast_i_bits(15,3); //15= 1111 and 8 = 1000
    
    }
} 