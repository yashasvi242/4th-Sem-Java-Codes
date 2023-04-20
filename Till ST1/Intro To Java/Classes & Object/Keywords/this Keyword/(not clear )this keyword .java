public class Demo {
  
  // below code is not yet clear 
    
    int number;
    
    void getName(){
        System.out.println("Object Returned");
    }
    
    Demo display(){
        // returning current object
        return this;
    }
    
    public static void main(String[] args){
        
        Demo d = new Demo();
        Demo d1 = d.display(); // this line will create a new reference 'd1' of object 'd'
        Demo d2 = d; // this line will create a copy 'd2' of object 'd' 
        
        d1.number = 10;
        
        System.out.println("d's number : " + d.number);
        System.out.println("d1's number : " + d1.number);
        System.out.println("d2's number : " + d2.number);
        
    } 
}
/*
Output :- 

d's number : 10
d1's number : 10
d2's number : 10


*/
