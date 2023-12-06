import java.util.Stack;
public class ParanthesisValidity{
    // O(n)
    public static boolean isPair(char a, char b){
        if(a == ')'  && b == '('){
            return true;
        }
        else if(a == ']'  && b == '['){
            return true;
        }
        else if(a == '}'  && b == '{'){
            return true;
        }
        return false;
    }
    public static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
           
          
        if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{' ){
                st.push(str.charAt(i));
        }

        else{
            if(st.isEmpty()){
                return false;
                }
            if(isPair(str.charAt(i), st.peek())){
                st.pop();
            }
            else{
                return false;
            }
           
        }
         
    }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "{()[{}]()}";
      
        System.out.println( isValid(str) );
 
    }
}