public class Demo{
    
    public void test(Integer i){
        System.out.println("test(Integer)");
    }
    
    public void test(String name){
        System.out.println("Method ==> test(String)");
    }
    
    public static void main(String[] args){
        Demo obj = new Demo();
        Integer a = null;
        obj.test(a); // correct way 
        // obj.test(null) // incorrect way
        String b = null;
        obj.test(b);
    }
}

/*
Output :- 

test(Integer)
Method ==> test(String)

*/
