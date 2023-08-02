public class MyThread implements Runnable{

    @Override
    public void run() {
        // task for thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("value of i is : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
        
    }

    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        Thread thread = new Thread(t1);
        MyAnotherThread t2 = new MyAnotherThread();
        t2.start(); //call to Thread class which is extended
        thread.start(); // implemented runnable interface

    }

    
}