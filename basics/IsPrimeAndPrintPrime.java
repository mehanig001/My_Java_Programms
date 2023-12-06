public class IsPrimeAndPrintPrime{
  public static boolean isPrime(int n){
    for(int i = 2; i<=(n/2); i++ ){
      if((n%i) == 0){
        // System.out.println("no " + n + " is not a prime ");
        return false;
      }
    }
    // System.out.println("yes" + n + " is a prime");
    return true;
  }
    public static void printPrime(int n){
    //   int count = 2;
    //   System.out.print("1,2,");
    //   for(int i = 3; i<=n; i++ ){
        
    //     for(int j = 2; j<=(n/2); j++){
    //       if(i%j == 0){
    //         break;
    //       }
    //       System.out.print(i + ",");
    //       count++;
    //       break;
    //     }
    //   }
    //   System.out.println();
    //   System.out.println( "no of primes between 1 and " + n + " is : " +count);
        int count = 0;
      for(int i = 1; i < n; i++){
        if(isPrime(i)){
            System.out.print(i + " ");
            count++;
        }
      }
      System.out.println();
      System.out.println("No of primes between 1 and "+ n + " is "+ count);
    }
  public static void main(String[] args) {
    System.out.println( isPrime(9) );
    printPrime(100);
  }
}
    

