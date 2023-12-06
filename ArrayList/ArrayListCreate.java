import java.util.Arrays;

public class ArrayListCreate{

    public static class ArrayLists{
    static int arr[] =  new int[1];
    ;
    static int size = 0;
    static int i = 0;
    

    public static void append(int data){

        if(size == arr.length){
            int brr[] = new int[arr.length * 2];
            brr = Arrays.copyOf(arr, arr.length * 2);
            arr = new int[brr.length];
            arr = Arrays.copyOf(brr, brr.length);
        }
        arr[i] = data;
        size++;
        i++;
    }
    public static void print(){
        for(int j = 0; j < i; j++){
            System.out.print(arr[j] + " ");
        
        }
    }

}
    public static void main(String[] args) {
        ArrayLists list = new ArrayLists();
        list.append(4);

       System.out.println(list.size + " size ");
        
        list.print();
    }
}