public class Palindrome {
    public static void main(String[] args) {
    
        String str = "racecar";
        System.out.println(str.replace('e','p'));
      
        System.out.println(str);
        
        for(int i = 0; i <= (str.length())/2; i++){
            if(str.charAt(i) == str.charAt(str.length() - i - 1)){
               

            }
            else{
                System.out.println("No");
                return;
            }
          
        }
        System.out.println("yes");
    }
}
