public class Consumer extends Thread{
    Company c;

    public Consumer(Company c){
        this.c = c;
    }

    public void run(){
        int i = 1;
        while(true){
            c.consumeItem();
            try {
                Thread.sleep(1000);
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }   
    }
}
