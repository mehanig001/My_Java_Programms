public class practise {
    public static int trappingWater(int arr[]){
        int tw = 0;
        for(int k = 0; k<arr.length; k++){
        //calculating leftmax
        int lm = Integer.MIN_VALUE;
        for(int i = 0; i<=k;i++){
            if(arr[i]>lm){
                lm = arr[i];
            }
        }
        //right max
        int rm = Integer.MIN_VALUE;
        rm = arr[k];
        for(int j = k; j<arr.length;j++){
            if(arr[j]>rm){
                rm = arr[j];
            }
        }
        //water level
        int wl = Math.min(lm, rm);

        //trapped water
        tw = tw + (wl - arr[k])*1;
    
    }
    return tw;

    }
    public static void main(String[] args) {
        int hieght[] = {4,2,0,6,3,2,5};
        System.out.println(trappingWater(hieght));
        
    }
    
}
