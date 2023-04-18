public class MyClass {
  
  // concat string 
    
    String name;
    
    public String getName(String st){
        String name = "Welcome";
        name += st;
        return name;
    }
    
    public static void main(String args[]) {
        
        MyClass obj = new MyClass();
        String ans = obj.getName(" class");
        System.out.print(ans);
        
    }
}
