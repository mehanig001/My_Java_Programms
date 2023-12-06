import java.util.*;
public class ArrayLists1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> list1 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        ArrayList<Integer> ans = new ArrayList();
        for(int i = list.size() - 1; i >=0; i-- ){
            ans.add(list.get(i));
        }
        System.out.println(ans);
        
    }
}