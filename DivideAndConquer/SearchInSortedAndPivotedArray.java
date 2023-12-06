public class SearchInSortedAndPivotedArray {
    // given a array in asc order and pivoted along a point;
    // two line method breaked from _____; gar tar mid se chota aur si se bada to first line me aise wale cases
    public static int search(int arr[], int target, int si, int ei){
        if(si>ei){
            return -1;
        }
        //kam
        int mid = si + (ei -si)/2;
        // case found
        if(arr[mid] == target){
            return mid;
        }
        // case mid on L1
        if(arr[si] <= arr[mid]){
            //case a left
            if(arr[si] <= target && target<arr[mid]){
                return search(arr, target, si, mid - 1);
            }
            else{
                //case b right
                return search(arr, target, mid +1 , ei);  
            }
        }
        // on L2 mid
        else{
            if(target>arr[mid] && target <= arr[ei]){
                //right L2 case c
                return search(arr, target, mid + 1, ei);
            }
            else{
                //left L2 case d
                return search(arr, target, si, mid - 1);
            }

        }
        
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 7;
        System.out.println( search(arr, target, 0 , arr.length -1) );
    }
    
}
