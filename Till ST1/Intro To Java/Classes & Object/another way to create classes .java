public class classesInJava {

    static class Student{
        String name;
        int rollno;
        int age;
        void info(){
            System.out.println("Name : " + name );
            System.out.println("Roll : " + rollno);
            System.out.println("Age : " + age);
        }
    }

    public static void main(String args[]){
      
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
