
// Creating custom 'MyException' so that we can overwrite the toString() (math.lang) of default JVM exception handler
class MyException extends Exception{

    private int ex;  // 3.then prog reaches here with val -10
    MyException(int a){ 
        ex = a;
    }
    public String toString(){
        return "My Exception[" + ex + "] is less then ZERO"; 
    }
}

class Demo{
    static void sum(int a, int b) throws MyException{
        if(a < 0){
            throw new MyException(a);  // 2. from here prog jumps to class 'MyException' and its objext will be created, and its contructor(-10) will be called 
                                    // 4. from here prpg jumps to catch block (to resolve the exception)
        }
        else{
            System.out.println(a+b);
        }
    }

    public static void main(String ... args) {

        try{
            sum(-10,10); // 1.from here prg jumps to line 14 
        }
        catch(MyException me){
            System.out.println(me);   // 5. now toString() of the 'MyException class is printed '
        }
    }
}

// Output :- 
// My Exception[-10] is less then ZERO

// note : in this eg. we overwrite the toString function, thats why the class name was not printed.
