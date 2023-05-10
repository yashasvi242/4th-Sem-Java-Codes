/*
VIMP Note: at line 29, thread t1 will be called and returned at the same time, now t1 is simultaneously running in its own call stack, and immediately t2 is called, and this way they both 
            are now running simultaneously, thats why we can never guess the output of the program, coz it totaly depends on the processor and not on how u invoke the run by .start()
            but if we directly invoke .run() without using .start(), then the t1 thread will be completed first, then the t2 will be completed afterwards the completion of thread t1.
            
            in Multithreading multiple stacks are there 
            in Single Threading no multiple stacks exist, there is only 1 stack i.e of the main thread
    
*/
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

        Thread t1 = new Thread(th1);  // read note at the top
        Thread t2 = new Thread(th2);
        t1.start();//1.
        t2.start();//2.

        // 1,2 will invoke both the threads simultaneously (not one by one)
       // note :- if we called .run() rather then start then it will become single tasking, i.e both calls will be one by one and not simultaneously

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
