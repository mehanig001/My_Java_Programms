public class Strings {
    public static void upper(String str){
        StringBuilder newstr = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        newstr.append(ch);
        for(int i =1; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                newstr.append(str.charAt(i));
                i++;
                newstr.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                newstr.append(str.charAt(i));
            }
        }
        System.out.println(newstr);
        
    }
    public static void main(String[] args) {
        String str = "what, is Your name";
        upper(str);

    }
}
