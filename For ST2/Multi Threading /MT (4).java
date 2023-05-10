
class MyThread extends Thread{//1. extended 'Thread' because 'Thread' already has a lot of methods (not like Runable that has only .run in it)

    public void run(){
        System.out.println("concurrent thread started running..");
    }
}
class MyThreadDemo1{
    public static void main(String ... args) {

        MyThread mt = new MyThread();  // here this mt will have all the fun of Thread coz it has extended that class
        mt.start();
        
    }
}    


// concurrent thread started running..
