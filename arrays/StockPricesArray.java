import java.nio.ByteBuffer;

public class StockPricesArray {
    // time complexity = O(n)
    public static int stockProfit(int arr[]){
        //loop
        int bp = arr[0];
        int maxprofit = 0;
        System.out.println("day 1 me kahe ka profit");
        for(int i = 1; i < arr.length; i++){
            //buy price = min(arr[i], buyprice)
            bp = Math.min(bp,arr[i]);
            //sp at ith day = arr[i]
            int sp = arr[i];
            //profit
            int p = sp - bp;
            if(p<0){
                return 0;
            }
            System.out.println("profit of day " + (i + 1) + " is " +p);
            maxprofit = Math.max(maxprofit, p);
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int stockPrices[] = {7,1,5,3,6,4};
        System.out.println(stockProfit(stockPrices));
    }
    
}
