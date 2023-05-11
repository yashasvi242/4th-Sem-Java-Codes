public class MyThread4 extends Thread {
    
    MyThread4(String str){
        super(str);
    }

    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread4 t1 = new MyThread4("first thread");
        MyThread4 t2 = new MyThread4("second thread");

        t1.start(); // t1 thread started

        try{
            t1.join(1500); // t2 will be finished first and after 1500 ms anything after that will join 
        }catch(InterruptedException ie){
            System.out.println(ie);
        }
        
        t2.start();
        try{
            t2.join(1500); // waiting for t2 to finish
        }
        catch(InterruptedException ie){
            System.out.println(ie);
        }

        System.out.println("ended");
    }
}

/*
 Output : 

first thread
second thread
ended

explanation : t1 will start, then after it is finished any other line will wait for 1.5s then t2 will start, then after t2 is finished 1.5 sec later 'ended' will be printed 
 */
