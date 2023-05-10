
class MyThread implements Runnable{
    public void run(){
        System.out.println("concurrent thread started running...");
    }
}
public class MyThreadDemo{

    public static void main(String ... args){
        MyThread mt = new MyThread(); // created our own obj which will only have a .run() in it
        Thread t = new Thread(mt); // now 'Thread' is the main class and it already has a .run() (which is present in mt) we will pass 'mt' objext as the argument 
        t.start();
        t.run();
    }
}

/*
Output :- 

concurrent thread started running...
concurrent thread started running...


note : we implemented our own class with '.run' coz we wanted to create a thread which has our own .run() function in it.


*/
