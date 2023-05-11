class MyThread1 implements Runnable{
    public void run(){
        for(int i=0; i < 5; i++){
            System.out.println("First Child Thread : " + i);
        }
        System.out.println("\t First child existed");
    }
}

class MyThread2 implements Runnable{
    public void run(){
        for(int i=0; i < 5; i++){
            System.out.println("Second Child Thread : " + i);
        }
        System.out.println("\t Second child existed");
    }
}

class MultipleThread2{
    public static void main(String ... args){

        MyThread1 mt1 = new MyThread1();
        Thread t1 = new Thread(mt1);
        t1.start();

        MyThread2 mt2 = new MyThread2();
        Thread t2 = new Thread(mt2);
        t2.start();

        int j=0;
        while(j < 4){
            System.out.println("Main Thread:" + j);
            j++;
        }

        System.out.println("\t Main thread existing");
    }
}

/*
 Output : 

First Child Thread : 0
First Child Thread : 1
Main Thread:0
Main Thread:1
Main Thread:2
Main Thread:3
Second Child Thread : 0
First Child Thread : 2
         Main thread existing
Second Child Thread : 1
First Child Thread : 3
Second Child Thread : 2
First Child Thread : 4
Second Child Thread : 3
Second Child Thread : 4
         First child existed
         Second child existed

 */
