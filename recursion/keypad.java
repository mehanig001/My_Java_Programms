public class keypad {
    public static String [] keypad = {" ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void Collections(int i , String str,String collections){
        if(i==str.length()){
            System.out.println(collections);
            return;
        }
        char currChar = str.charAt(i);
        String mapping = keypad[currChar - '0'];
        for (int j = 0;j<mapping.length();j++){
            Collections(i+1, str, collections+mapping.charAt(j));

        }

    }
    public static void main(String[] args) {
        Collections(0, "32", "");
        
    }
}
