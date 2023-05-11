

public class MyThread3 extends Thread{

    public void run(){
        System.out.println("r1 ");
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException ie){

        }

        System.out.println("r2 ");
    }

    public static void main(String ... args){
        MyThread3 t1 = new MyThread3();
        MyThread3 t2 = new MyThread3();

        t1.start(); // t1 thread has been invoked

        try{
            t1.join(); // t2 will join the thread after t1 is finished  (waiting for t1 to be finished)
        }
        catch(InterruptedException ie){
        }

        t2.start();
    }
}

/*
 Output :- 

r1 
r2 
r1
r2 

 note : in the prv example we knew the output but still we can not tell which output is of which thread,
        but in this ex we know that t2 will invoke after the end of t1 so that means that ist r1 and r2 are of thread 1, then r1 and r2 are of thread 2

also note : t1.join() means that anything after this line will join 't1' ones it gets finished 

        */
