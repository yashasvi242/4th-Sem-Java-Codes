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
        
        Student std1 = new Student(); 
        
        // print data members using method
        std1.info();

    }   

}

/*  Output :-

Name : null
Roll : 0
Age : 0
  
  */
