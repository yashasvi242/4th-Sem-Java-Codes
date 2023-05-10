
/*
There are 2 ways to create Threads
    1. using Throw class
    2. using Runnable interface
    
    Throw class has a lot of methods and contructors that are predefined eg. .run(), .start(), .isAlive(), .setName(), ....
    Runnable interface has only 1 method .run() 
    
    so runnable interface should be used if we only want to create a thread, but if not then use 'Throw' class

*/
class MultiThreading{

    public static void main(String ... args){
        
        Thread t = Thread.currentThread();
        System.out.println(Thread.currentThread().getName()); // lets print the name of this current thread (i.e main)
    }
}

//Output :- 
// main
