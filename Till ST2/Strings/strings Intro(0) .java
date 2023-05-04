import java.lang.*;

/*
  - String is an object that represents sequence of characters.
  - java.lang packages
  - every string we create in java is an object of type String
  - string obj are immutable i.e we can not change its state, i.e conversion from string to int will be stored in a new integer, but the original string remains the same
  - Creating string :- 
    
    1) using string literal
        String s1 = "hello java";
        
        here String is class 
        s1 is object 
        "hello java" is the argument passsed to objext s1 of class s1

    2) using new keyword
        String s1 = new String("Hello Java");
        
        each time we cerate a string literal the JVM checks the string pool first
        if the string literal already exists in the pool then new string is not created i mean new memory is not asigned, rather
        a reference to the poop instance is returned, if string doesnt exist in the poop then object is created and new memory is asigned.

        string constant pool is special memory for strings

        eg. String s1 = "hello";
            String s2 = "hello";

                Or 
            String s1 = "hello";
            String s2 = s1;

            here 2 objects are created, but s2 is a reference to object 's1'.

            if we change s1's data then s2's data will also change, but if we change s2's data, s1 data will not change and a new object (not reference) for s2 will be created

    
        - int can take ony int 
        - float can take int as well as float 
        - String can take 'int' 'string' etc. and still work
            eg. String s = "hello" + 11;   //(works file)  s = "hello11"


        String comparision :- ⭐
            1. ==  (checks if 2 objects are pointing to same memory or not)
            2. equals() -  (checks if 2 objects have same string data )
            2. CompareTo() - returns diff of asci value of the 2 strings/chars 
  - 
  - 
 */
class StringsIntro{

    public static void main(String ... args){
        String s1 = "hello";
        // String s2 = "hello";
        String s2 = s1;

        s1 = "hi";
        System.out.println(s1);
        System.out.println(s2);

        
    }
    
}
   


/*  Output :- 

        hi
        hello
 */
