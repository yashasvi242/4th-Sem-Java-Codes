
/* Lets create array of objects and then print its data members 

note :- 

In C++, this is a pointer to the current object, so you would use the -> operator to access its members. For example: this->memberVariable.
In Java, this is a reference to the current object, so you would use the . operator to access its members. For example: this.memberVariable.
*/

class Student{
    public int roll;
    public String name;
    Student(int roll, String name){ 
        this.roll = roll;  // read note at start
        this.name = name;
    }

    void printDetailsCasual(){
        System.out.print("roll no " + this.roll + " is " + name + "\n");
    }
}

// main
public class arrayOfObjects {

    public static void main(String args[]){

        Student arr[] = new Student[5]; // this array will store objects as elements 

        // creating 5 objects 'dynamically' and storing obj(instance) into array 
        arr[0] = new Student(1,"Yashasvi");
        arr[1] = new Student(2,"Sahil");
        arr[2] = new Student(3,"Kaveri");
        arr[3] = new Student(4,"Vibha");
        arr[4] = new Student(5,"Shyam");
        
    
        // print all objects details 
        System.out.println("-----------------");
        for(int i=0; i < arr.length; i++){
            arr[i].printDetailsCasual();
        }
        System.out.println("-----------------");
    
    }
}


/* Output :- 
-----------------
roll no 1 is Yashasvi
roll no 2 is Sahil
roll no 3 is Kaveri
roll no 4 is Vibha
roll no 5 is Shyam
-----------------
 */
