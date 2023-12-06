public class Rcrsn2 {
    public static void avg(int i,int a[],int sum ){
        int l = a.length;
        if(i>l){

            int avg = sum/l;
            System.out.println(avg);
            return;
        }
        
        
        sum = sum + a[i];
      
        avg(i+1,a,sum);
       

    }
    public static void main(String[] args) {
        avg(0,[5],0);
        
    }
    
}
