public class MyClass {
  
  // concat string 
  // make sure to use 'static' or 'static public' for all methods declared in class in case u are using offline compiler like VSCode 
    
    String name;
    
    public String getName(String st){
        String name = "Welcome";
        name += st;
        return name;
    }
    
    public static void main(String args[]) {
        
        String ans = getName(" class");
        System.out.print(ans);
        
    }
}
