import java.util.ArrayList;

public class Subsets {


   
    public static void printSubsets(int n,ArrayList<Integer> subset){
        if(n==0){
            System.out.println(subset);
           return;

    }
    //if wants to add
    subset.add(n);
    printSubsets(n-1, subset);
    //doessn't wanna add
    subset.remove(subset.size()-1);
    printSubsets(n-1, subset);
}

    public static void main(String[] args) {
        ArrayList <Integer> subsets = new ArrayList<>();
        int n = 3;
        printSubsets(n,subsets);
     
        

    }

}