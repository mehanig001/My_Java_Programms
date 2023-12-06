public class b{
  public static void isPrime(int n){
    for(int i = 2; i<=(n/2); i++ ){
      if((n%i) == 0){
        System.out.println("no " + n + " is not a prime ");
        return;
      }
    }
    System.out.println("yes" + n + " is a prime");
    
  }
    public static void printPrime(int n){
      int count = 2;
      System.out.print("1,2,");
      for(int i = 3; i<=n; i++ ){
        
        for(int j = 2; j<=(n/2); j++){
          if(i%j == 0){
            break;
          }
          System.out.print(i + ",");
          count++;
          break;
        }
      }
      System.out.println();
      System.out.println( "no of primes between 1 and " + n + " is : " +count);
      
    }
  public static void main(String[] args) {
    isPrime(78);
    printPrime(10);
  }
}
    

