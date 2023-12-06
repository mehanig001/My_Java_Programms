public class permutations {
    public static void permute(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;

        }
    
        for (int j = 0; j < str.length(); j++) {
            char currChar = str.charAt(j);
            String newstr = str.substring(0, j) + str.substring(j+1);
            permute(newstr, ans+currChar);
            
        }
   
    }
    public static void main(String[] args) {
        permute("Dab", "");
        
    }
    
}
