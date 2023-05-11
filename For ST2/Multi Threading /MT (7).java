import java.rmi.server.UID;

public class MultipleThread1 implements Runnable{
    String task;
    MultipleThread1(String task){
        this.task = task ;
    }

    public void run(){
        for(int i=0; i <= 5; i++){
            System.out.println(task + " : " + i); // read note
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String ... args){

        System.out.println("Name of thread : " + Thread.currentThread());

        // multiple child threads acting on single object
        MultipleThread1 mt = new MultipleThread1("Hello Java");
        Thread t1 = new Thread(mt); 
        Thread t2 = new Thread(mt); 
        Thread t3 = new Thread(mt); 

        t1.start();
        t2.start();
        t3.start();

        int count = Thread.activeCount();
        System.out.println("No of active threads : " + count); // 4 (main, t1, t2, t3)
        
    }
}

/*
Output :- 

Name of thread : Thread[#1,main,5,main]
Hello Java : 0
Hello Java : 0
Hello Java : 0
No of active threads : 4
Hello Java : 1
Hello Java : 1
Hello Java : 1
Hello Java : 2
Hello Java : 2
Hello Java : 2
Hello Java : 3
Hello Java : 3
Hello Java : 3
Hello Java : 4
Hello Java : 4
Hello Java : 4
Hello Java : 5
Hello Java : 5
Hello Java : 5


note : t1 prints HelloJava :0, then goes too sleep for 1s , at that time t2 invokes and printed Hello Java 0 and goest to sleep, then t3 invokes and prints HelloJava 0 and goes to sleep,
        then 'No of active threads : 4' line gets printed and this continues...  
 */
