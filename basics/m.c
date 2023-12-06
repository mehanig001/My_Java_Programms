#include <stdio.h>
#include <math.h>
    void main(){
        int add = 1, sum = 0;
        for(int i = 0; i <= 3; i++){
            add+=i;
            sum += pow(add,4);
        }
            printf("%d sum=", sum);
        return;
    }
