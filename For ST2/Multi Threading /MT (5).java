
class MyThread extends Thread{//1. extended 'Thread' because 'Thread' already has a lot of methods (not like Runable that has only .run in it)

    public void run(){
        System.out.println("concurrent thread started running..");
    }
}
class MyThreadDemo1{
    public static void main(String ... args) {

        MyThread mt = new MyThread();
        mt.run(); 
        mt.start(); // start() invokes run() thats y both outputs the same
    }
}    

/*
 concurrent thread started running..
 concurrent thread started running..
*/

/*  note : if we call .run(), then a new call stack will not be created, .run() will be added to the mainStack only
        |           |
        |           |       
        |  mt.run() |       
        |  main()   |
        |-----------|
            curr stk of main thread

note : if we call .start() rather then .run() then a new call stack for .run() will be created 
        |           |
        |           |       
        |           |       
        |  main()   |   call stack of main thread 
        |-----------|

        |           |
        |           |        call stack of .run() thread 
        |  mt.run() |   
        |-----------|

        THis is multithreading.
*/
