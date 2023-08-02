public class ThreadOperation {

    
    public static void main(String[] args) {
        System.out.println("program started..");
        
        new Thread();
        //the operations will be performed on the current thread which is the main thread
        //as we are running the code in the main block so..
        Thread t = Thread.currentThread();  

        String threadName = t.getName();
        System.out.println("The name of the running thread is : " + threadName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.setName("my main");
        System.out.println("New name is : " + t.getName() );
        System.out.println("program ended..");
    }
    
}
