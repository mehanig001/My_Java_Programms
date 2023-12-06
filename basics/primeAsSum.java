public class primeAsSum {

    public static void main(String[] args) {
        int sum = 0;
        int count =0;
        boolean flag = false;
        for(int i = 2;i<=100;i++){
            for(int j = 2; j<i;j++){
                if(i%j==0){
                   j=i;
                   flag = true;
                    
                }
                if(flag == false){
                    System.out.println(i);
                    sum+=i;
                    if(sum == i){
                        count++;
                    }
                    
                }
            }
        }
        System.out.println(count);
    }
    
}
