import java.util.*;

class Student{

    int roll;
    String name;
    Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
    public String toString(){
        return (roll + " " + name);
    }
}

class MyComparator implements Comparator<Student>{ // this will sort the arrayList on basis of the roll no
    public int compare(Student s1, Student s2){
        if(s1.roll == s2.roll) return 0;
        else if(s1.roll > s2.roll) return 1;
        else return -1;
    }

}

public class Test{
    public static void main(String ... args){

        ArrayList<Student> ts = new ArrayList<Student>();

        ts.add(new Student(45, "Rahul"));
        ts.add(new Student(11, "Adam"));
        ts.add(new Student(19, "Alex"));
        Collections.sort(ts, new MyComparator());
        System.out.println(ts);
        
    }
}

// [11 Adam, 19 Alex, 45 Rahul]
