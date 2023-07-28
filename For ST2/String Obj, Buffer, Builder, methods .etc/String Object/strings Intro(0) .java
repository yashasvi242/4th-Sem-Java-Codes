import java.lang.*;

/*
    - Strings are immutable (but can be muted using string buffer)

  - String is an object that represents sequence of characters.
  - java.lang packages (do not need to import it)
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

            if we change s1's data then s2's data will not change,rather s1 will point to a new block with new data and s2 will point to the old data only, and both will have different memory in string pools for their data 

    
        - int can take ony int 
        - float can take int as well as float 
        - String can take 'int' 'string' etc. and still work
            eg. String s = "hello" + 11;   //(works file)  s = "hello11"


        String comparision :- ⭐
            1. ==  (checks if 2 objects are pointing to same memory or not)
            2. equals() -  (checks if 2 objects have same string data )
            2. CompareTo() - returns diff of asci value of the 2 strings/chars 
        
        String functions :-  
            1. charAt(index)
            2. equalsIgnoreCase() - it ignores the case and just checks the 2 string, return true and false
            3. indexOf() 
                indexOf(char) - first occ of char
                indexOf(char, x) - first occ of char starting from x 
                indexOf(string) - first occ of this string, returns first char's presence
            
            4. length()  - number of char in the string (includes spaces)
            5. str.replace(oldChar, newChar) 
            
            6. str.substring(startIndex, endIndex)
                start index inclusive, end index exclusive 
                
            7. str.toLowerCase();
            8. str.toUpperCase();
            9. str.valueOf() 
                // convert int to str (primitive data to string)
                String s1 = String.value(num);
                // string to primitive
                int num1 = parseInt(s1);

            10. toString()
                    - if we do not override toString() then objs id )hascode
 will pe printed

            11. str.trim() - removes the space from start and end of the string (not from middle)

            12. str.contains("somestring") : retuns true if "somestring" is found,else found

            13. str.startsWith()
                    str.startsWith("C") - return true if str start with C
                    str.startsWith("t") - return false if str doesnt start with t
                    str.startsWith("k",4) - return true if str starts with k starting the search from index 4
            
            14. str.endsWith()
                    same as above
            
            15. .format() 
                to format the string 

                %d 
                %t
                %x 
                %c, etc

            16.  getBytes() - covertes string into asci value for each character and will store in tinot a character

            17.  getChars() - copy content from a string into character array 


            18. .empty()
            19. .join()
                    eg. str.join(":","9","10","11") ===> 9:10:11
                    eg. str.join(":","9","10","11") ===> 9:10:11
                    eg. str.join(":","hello hi") ===> hello hi
                    
             20. .split() -> used to split a multi word string on basis of a regex eg. space " " and store the words into an array 
                    
                    String arr[] = str.split() 

 */
class StringsIntro{

    public static void main(String ... args){
        String s1 = "hello";
        // String s2 = "hello";
        String s2 = s1;

        /*
          till here what is happening is :- 



            s1 ------------>("hello")
                            /
            s1 ------------/

            
         */

        s1 = "hi";
        System.out.println(s1);
        System.out.println(s2);


        /*
         now :- 

                        ("hi") 
                        /
            s1 --------/    ("hello")
                            /
            s1 ------------/

            
         */
         */
        
    }
    
}
   


/*  Output :- 

        hi
        hello
 */
