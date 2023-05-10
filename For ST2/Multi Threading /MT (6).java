
public class MyThread extends Thread{

    String task;

    MyThread(String task){
        this.task = task;
    }

    public void run(){
        for(int i=1; i <= 5; i++){
            System.out.println(task + " : " + i);
            try{
                Thread.sleep(10000); // pause the thread execution for 1000 milisecond
            }
            catch(InterruptedException ie){
                System.out.println(ie.getMessage());
            }
        }
    }

    public static void main(String ... args){
        MyThread th1 = new MyThread("Cut the ticket");
        MyThread th2 = new MyThread("show your seat number");

        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);
        t1.start();//1.
        t2.start();//2.

        // 1,2 will invoke both the threads simultaneously (not one by one)
    }

}
/*
 Output : - 

show your seat number : 1
Cut the ticket : 1
Cut the ticket : 2
show your seat number : 2
show your seat number : 3
Cut the ticket : 3
show your seat number : 4
Cut the ticket : 4
show your seat number : 5
Cut the ticket : 5

note : output may wary i.e we can not predict it, because both tasks will be executed simultaneously, and processor will decide the output 
 */
