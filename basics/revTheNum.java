public class revTheNum {
  
        public static void main(String[] args) {
            int n = 108;
            // to reverse a number;
            int rev = 0;
            int m = 0;
            //m = (n%10)*10000 + ((n%100)/10)*1000 + ((n%1000)/100)*100 + ((n%10000)/1000)*10 + ((n%100000)/10000);
            while(n>0){
                m = (n%10);
                n = n/10;
                System.out.print(m);
                rev = (rev * 10) + m;
            }
            System.out.println();
            System.out.println("Rev is " + rev);
        }
}
