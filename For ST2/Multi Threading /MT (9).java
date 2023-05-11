
public class MyThread extends Thread {

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

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());

        
    }
    
}

/*

Output :- 
    
true
true
r1
r1
r2
r2

 */
