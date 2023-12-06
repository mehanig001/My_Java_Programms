public class rec_arraysorted {
    public static void checkinc(int i,int a[]){
        if(i>a.length-2){
            System.out.println("Yeah it is strictly inc order");
            return;
        }
        if(a[i]>=a[i+1]){
            System.out.println("No it is not in strictly inc order");
            return;
           

        }
       

        checkinc(i+1, a);
    }
    public static void main(String[] args) {
        int k[] = {1,2,3,5,8};
        checkinc(0,k );
        
    }
}
