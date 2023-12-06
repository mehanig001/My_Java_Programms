public class SubsetsBacktrack {
    public static void subset(StringBuilder str, int i, String str1){
         
        // base case 
        if( i == str.length()){
            System.out.print(str1 + ", ");
            return;
        }
        //work
        subset(str, i + 1, str1 + str.charAt(i));  // add hona chahta h
        subset(str, i + 1, str1); // add nahi hua 
        return;

    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abc");
        subset(str, 0, "") ;
    }
}
