public class arr {
    public static void main(String[] args) {
        
    
    int arr[] = {1,2,2,3,3,3,4};
    
    
    for(int i =0; i<arr.length -1; i++){
        int count = 1;
        for(int j = i + 1; j<arr.length; j++){
           if((arr[i]-arr[j] == 0)){
            count++;
           
            
            
            
            
            }
            if(count ==  1){
                System.out.println(arr[i]);
            }
           
        }
    
    }
    }
    
}
