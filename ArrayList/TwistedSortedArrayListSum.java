import java.util.*;
public class TwistedSortedArrayListSum {
    public static boolean sumExists(ArrayList<Integer> list, int target){
        // [11, 15, 6, 7, 8, 9, 10]
        //find breaking point 15
        int bp = 0;
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
            }
        }
        // now rotation me lp = (lp + 1) % n   &&  rp = (n + rp - 1) % n
        int lp = bp + 1;
        int rp = bp;
        int n = list.size();
        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            if(list.get(lp) + list.get(rp) > target){
                rp = (n + rp - 1) % n;
            }
            else{
                lp = (lp + 1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(sumExists(list,16));

    }
}
