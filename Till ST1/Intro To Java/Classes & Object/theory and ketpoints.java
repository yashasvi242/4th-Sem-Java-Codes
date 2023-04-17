public class Student{

    String name;
    int rollno;
    int age;
    void info(){
        System.out.println("Name : " + name );
        System.out.println("Roll : " + rollno);
        System.out.println("Age : " + age);
    }

    public static void main(String args[]){
        // Types of variables in java :-

        //1. instance variable (inside class but outside functions/methods)
            //- by default int instances have value 1, and string has value null, and bool have value false
        //2. static variable (retains the value, untill we change it)
        //3. local variable (which can only be used inside a specific scope).
            //- by default local variable int have garbage values


        // classes imp terms :- 
        // fields  - empty members or uninitialized variables of a class
        // methods - functions of class
        // constructor - 
        // block - a simple curly bracs scope for loop etc.

        //creating object of class Student
        Student std1 = new Student(); 
        //asign values
        std1.name = "Yashasvi";
        std1.rollno = 1;
        std1.age = 18;
        
        // print data members using method
        std1.info();

    }   

}

/* 
Output :- 

Name : Yashasvi
Roll : 1
Age : 18


*/
