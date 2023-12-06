import java.awt.List;
import java.util.*;

public class MultiDimLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
       for(int i = 1; i<6; i++){
        list1.add(i);
        list2.add(i * 2);
        list3.add(i * 3);
       }
       ArrayList<ArrayList<Integer>> badilist = new ArrayList<>();
       badilist.add(list1);
       badilist.add(list2);
       badilist.add(list3);
       System.out.println(badilist);
       list2.remove(1);
       list2.remove(2);
       
       for(int i = 0; i < badilist.size(); i++){
        ArrayList<Integer> curr = badilist.get(i);

        for (int j = 0; j < curr.size(); j++) {
            
        
        System.out.print((badilist.get(i)).get(j) + " ");
        }
        System.out.println();
       }
     
    }
}
