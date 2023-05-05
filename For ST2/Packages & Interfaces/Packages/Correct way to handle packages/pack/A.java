package pack;

public class A{
    public static void print(){
        System.out.println("Working class A");
    }
}




// Error - if we remove the comments of class 'B' then it will not work because the file name can only be of 1 public class, so if file name is A, we can not access B
// if file name is B, we can not access A.
// solution :- for each class in a package folder, create a separate file for each class.
