package pack;
// file name : A.java

public class A{
    public static void print(){
        System.out.print("Working");
    }
}


public class B{
    public static void print(){
        System.out.print("Working");
    }
}


// Error - it will not work because the file name can only be of 1 public class, so if file name is A, we can not access B
// if file name is B, we can not access A.
// solution :- for each class in a package folder, create a separate file for each class.
