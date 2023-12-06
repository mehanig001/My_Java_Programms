public class ShortestPatth {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        int x = 0;
        int y = 0;

        for(int i = 0; i<str.length(); i++){
            char currChar = str.charAt(i);
            if(currChar == 'W'){
                x--;
            }
            if(currChar == 'E'){
                x++;
            }
            if(currChar == 'N'){
                y++;
            }
            if(currChar == 'S'){
                y--;
            }
           
            String newstr = "";
            
            for(int j = 0; j<=x; j++){
                newstr += "E";
                
            }
            for(int j = 0; j<=y; j++){
                newstr += "N";
               
            }
           System.out.println(newstr);
        }
        int x2 = x*x;
           int y2 = y*y;
           System.out.println( Math.sqrt(x2 + y2) );



    }
    
}
