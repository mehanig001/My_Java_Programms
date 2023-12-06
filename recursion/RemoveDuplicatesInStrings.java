public class RemoveDuplicatesInStrings {
    public static void removeDupli(String str, int i, StringBuilder newstr, boolean arr[] ){
        
        if (i == str.length() ) {
            System.out.println(newstr);
            return ; 
        }
            char curr = str.charAt(i);
            if(arr[curr - 'a'] == true){
                removeDupli(str, i + 1, newstr, arr);
            }
            else{
                
                arr[curr - 'a'] = true;
                removeDupli(str, i + 1,newstr.append(curr),arr);
            }
            return;
        }
       

      
    public static void main(String[] args) {
        String str = "abbcccdddd";
        
        removeDupli(str,0,new StringBuilder(""), new boolean[26]);

    }
    
}
