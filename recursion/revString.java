public class revString {
 
    public static int first = -1;
    public static int last = -1;
    public static void occ(int i,String str,char val){
        if(i == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char c = str.charAt(i);
        if(c == val){
            if(first == -1){
                first = i;
            }
            else{
                last = i;
            }
            
        }
        occ(i+1, str,val);
     }



       public static void main(String[] args) {

        occ(0,"Gautam Mehani",'a');

    }
}
