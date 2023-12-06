public class Bitwise {
    public static void main(String[] args) {
        
        /* Get Bit
        int a = 5;//0101
        int p = 3;  //here indexing starats from right side;
        int bitmask = 1<<p;
        if((bitmask & a)==0){
            System.out.println("zero");
        }
        else{
            System.out.println("one");
        }
        */
        /* Set Bit 
        int n = 5; //0101
        int pos = 1;
        int bitmask = 1<<pos;
        int m = bitmask | n; //7 = 0111
        System.out.println(m);    
        */

        /*Clear bit
        int n = 5;//0101
        int pos = 0; 
        int bitmask = 1<<pos;
        int m = ~bitmask & n; //4 = 0100;
        System.out.println(m);
        */

        //Updating 
        int n = 5; //0101
        int pos = 2;
        System.out.println("what do you want clear(0) or set(1)");
        int wanna = 0;
        int bitmask = 1<<pos;
        int m = ~bitmask & n; // 1 = 0001
        System.out.println(m);

        // if 
        /* 
        want = 1;
        int m = bitmask |n;
        sout(m);
        */


    }
    
}
