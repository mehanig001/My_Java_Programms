public class StringsCompression {
    public static void compressString(String str){
        StringBuilder newstr = new StringBuilder("");
        
        for(int i = 0; i<str.length() ; i++){
            Integer count = 1;
            char currChar = str.charAt(i);
            for(int j = i+1; j<str.length(); j++){
                if(str.charAt(j) == currChar){
                    count++;
                    i++;
                }
             

            }
            newstr.append(str.charAt(i));
            if(count>1){
                newstr.append(count);
            }
         
        }
        System.out.println(newstr);
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        compressString(str);
    }
}

