import java.util.HashSet;

public class subsequences {
    public static void sub(int i, String a,String x,HashSet<String> set){
        if(i == a.length()){
            if(set.contains(x)){
                return;
            }
            else{
            System.out.println(x);
            set.add(x);
            return;
            }
        }
        char current = a.charAt(i);
        //to be
        sub(i+1, a, x+current,set);
        //not to be
        sub(i+1, a, x,set);
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        sub(0, "aaa", "",set);
    }
    
}
