
public class MyThread2 extends Thread {

    public void run(){
        System.out.println("r1");
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
            System.out.println("Exception");;
        }
        System.out.println("r2");
    }
    
    public static void main(String ... args){

        MyThread2 t1 = new MyThread2();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
        
    }
    
}
/*

Output :- 

r1
r1
r2
r2

 */
