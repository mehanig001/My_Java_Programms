public class printPermutations {
    public static void permute(String str,String pairs){
        int i = 0;
        if(i == str.length()){
            System.out.println(pairs);
            return;
        }
        for( i = 0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            permute(newstr, pairs+currChar);
            
        }
    }
    public static void main(String[] args) {
        permute("na6", "");
    }
    
}
