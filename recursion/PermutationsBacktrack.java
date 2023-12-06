import javax.lang.model.element.RecordComponentElement;

public class PermutationsBacktrack {
    public static void permute(String str, String newstr){
        //basecase
        if( str.length() == 0){
            System.out.print(newstr + ", ");
            return;
        }
        //kam  O(n * n!)
        for(int i = 0; i<str.length(); i++){
            permute(str.substring(0, i) + str.substring(i+1,str.length()), newstr + str.charAt(i));
        }    
    }
    public static void main(String[] args) {
        String str = "abc";
        permute(str, "");
    }
}
