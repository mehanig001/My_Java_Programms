public class ArraylListCreate{

    public class ArraylLists{
    static int arr[];
    static int size = 2;
    public ArraylLists(){
        if(size){

        }
    this.arr = new int[size];
    }

    public static void append(int data){
        size++;
        arr[size] = data;
    }

}
    public static void main(String[] args) {
        ArraylLists list = new ArraylLists();

        list.append(2);
    }
}