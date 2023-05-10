// if we want out prog to excute from the very next line of exception, then put the try-catch in a new function like shown below.

class Demo{
    public static void checkNum(int num){

        // note : if we do not use try catch, then the program will not resume from the end of exception.

        try{
            if(num < 1){
                throw new ArithmeticException("Number is less than 1 ");
            }
            else{
                System.out.println("num is greater then 1");
            }
        }

        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }

    public static void main(String ... args){
        //Demo d = new Demo(); // not necessary to create obj, coz out above fun 'checkSum' is static 
        checkNum(-3);
        System.out.println("Exception completed");

        checkNum(3);
        System.out.println("Exception completed again");

    }
}

/*
 Output :- 
    
    java.lang.ArithmeticException: Number is less than 1 
    Exception completed
    num is greater then 1
    Exception completed again
 */
