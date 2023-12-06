public class removerepeated {
    public static boolean map[] = new boolean[26];
    
    public static void remRepeaters(String x,int i,String str){
        if(i == x.length()-1){
            System.out.println(str);
            return;
        }
        Character current = x.charAt(i);
        if(map[current -'a'] == true ){
            remRepeaters(x, i+1, str);

        }
        else{
            str+=current;
            map[current - 'a'] = true;
            remRepeaters(x, i+1, str);
        }
        


 
    }
      
    
    public static void main(String[] args) {
        remRepeaters("abbcaaddab"  , 0, "");
        
    }
}
