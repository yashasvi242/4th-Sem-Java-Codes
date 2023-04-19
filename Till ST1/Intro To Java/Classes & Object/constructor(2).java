public class AddDemo1{
  
  int a = 10;
  int b = 20;
  
  AddDemo1(int a, int b){ // parameterized constructor.
      this.a = a;
      this.b = b;
      
      System.out.println("Constructor called.");
      System.out.println("a : " + a);
      System.out.println("b : " + b);
  }
  
  public static void main(String args[]){
    AddDemo1 obj = new AddDemo1(10,20);
  }
}

/*

Constructor called.
a : 10
b : 20

*/
