public class BinarySearchInArray {
    public static int binarySearch(int arr[],int key){
        int start = 0;
        int end = arr.length -1;
        
        while(start<=end){
            int mid = (start + end)/2;
            if(key == arr[mid]){
                return mid;
            }
            else if(key < arr[mid]){
                end=mid - 1;
            
            }
            else{
                start = mid +1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int nums[] = {3,5,1,8,9};
        System.out.println(binarySearch(nums, 3));
     
    }
    
}
