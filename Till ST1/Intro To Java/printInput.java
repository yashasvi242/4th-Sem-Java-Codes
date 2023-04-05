import java.util.Scanner; // include this to take input 

/* Take input from user using 'Scanner' class

   => 4 methods to take input of diffent data types :- 
   
      - integer : nextInt()
      - float : nextFloat()
      - string (single word) : next()
      - string (multiple words) : nextLine()
*/

public class printInput {

    public static void main(String args[]){

        // creating instance(obj) of class 'Scanner'
        Scanner scn = new Scanner(System.in);

        // lets create a 'string' 'sentence' 'int' 'float'
        String word;
        String sentence;
        int num;
        float flt;

        // lets take input of (only 1 word) 
        System.out.println("-----------------------");

        System.out.println("enter a word : ");
        word = scn.next();
        scn.nextLine();   // include this so that the nextline \n gets consumed itself

        // lets take input of sentence 
        System.out.println("enter a sentence : ");
        sentence = scn.nextLine();

        // lets take input of an int 
        System.out.println("enter a integer : ");
        num = scn.nextInt();

        // lets take input of a float
        System.out.println("enter a float : ");
        flt = scn.nextFloat();

        System.out.println("-----------------------");
        System.out.println(" Output : ");

        // lets print all the variables 
        System.out.println(" word => " + word);
        System.out.println(" sentence => " + sentence);
        System.out.println(" int => " + num);
        System.out.println(" float => " + flt);

        System.out.println("-----------------------");


    }
}


/*
   Input : 
-----------------------
enter a word :
hi 
enter a sentence :
hello u r typing a sentence
enter a integer :
10
enter a float :
19.535
-----------------------
 Output :
 
 word => hi
 sentence => hello u r typing a sentence
 int => 10
 float => 19.535
-----------------------

*/
