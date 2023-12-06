import java.util.Stack;
public class DuplicateParanthesis {
    //O(n)
    public static boolean isPair(char a, char b){
        if(a == ')'  && b == '('){
            return true;
        }
        
        return false;
    }
    public static boolean isDuplicate(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            if(curr != ')'){
                st.push(curr);
            }
            else{
                int count = 0;
                while(! isPair(curr,st.peek()) ){
                    count++;
                    st.pop();
                }
                if(count < 1){
                    
                    return true;
                }
                else{
                st.pop();
                }

            }
        }

        
        return false;
    }
    public static void main(String[] args) {
        String str = "(a + (b + c + d))";
        System.out.println( isDuplicate(str));
    }
}
