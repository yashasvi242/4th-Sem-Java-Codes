#include<stdio.h>

int main() {
    
    // this is a 'c' program to understand static keyword and its working, although this will not work in java,coz java doesnt have  any main function, it has class with method 'main'
    
    
    for(int i=0; i < 2; i++){
        static int k = 0;
        for(int j=0; j < 10; j++){
            k++;
            printf("%d ", k);
        }
        
        printf("\n");;
    }
      
}

/*
Output : 
1 2 3 4 5 6 7 8 9 10 
11 12 13 14 15 16 17 18 19 20 
*/
