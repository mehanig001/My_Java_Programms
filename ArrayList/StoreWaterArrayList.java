import  java.util.*;
public class StoreWaterArrayList {
    public static int storeWater(ArrayList<Integer> list){
        int maxWater = 0;
        int lp = 0;
        int rp = list.size()-1;
        /* Brute Force direct Approach Time Comp = O(n ka square)
        */
        
//         for(int i = 0; i < list.size(); i++){
//             for(int j = i; j < list.size(); j++){
//             int height = Math.min(list.get(i),list.get(j));
//             int width = j-i;    
//             int storedwater = height * width; 
//             if(maxWater < storedwater){
//                 maxWater = storedwater;
               
//             }
//         }
//     }
//         return maxWater;
// }
        /* 
         * but idhar O(n) only
         */
        while(lp<rp){

            int height = Math.min(list.get(lp),list.get(rp));
            int width = rp - lp;
            int storedwater = height * width;
            if(list.get(lp)>list.get(rp)){
                rp--;
            }
            if(list.get(rp)>=list.get(lp)){
                lp++;
            }
            maxWater = Math.max(storedwater,maxWater);
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(2);  list.add(1);  list.add(5);  list.add(6);  list.add(2);  list.add(3);  
        System.out.println(storeWater(list));
    
    }
}
