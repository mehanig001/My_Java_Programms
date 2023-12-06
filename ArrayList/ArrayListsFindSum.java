import java.util.*;
public class ArrayListsFindSum {
    // public static boolean existSumInSortedOrNot(ArrayList<Integer> list,int target){
    //     // Brute Force O(n^2)
    //     for(int i = 0; i < list.size(); i++){
    //         for(int j = i+1; j < list.size(); j++){
    //             if(list.get(i) + list.get(j) == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
        
    // }

                     // Two Pointers Approach O(N)
    public static boolean existSumInSortedOrNot(ArrayList<Integer> list,int target){
        // Given that array list is sorted 
        int lp = 0;
        int rp = list.size() - 1;
        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            if(list.get(lp) + list.get(rp) > target){
                rp--;
            }
            else{
                lp++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println( existSumInSortedOrNot(list,10));
    }
}
