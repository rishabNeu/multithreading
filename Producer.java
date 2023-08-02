public class Producer extends Thread{

    Company c;

    public Producer(Company c){
        this.c = c;
    }

    public void run(){
       int i = 1;
        while(true){
            try {
                c.produceItem(i);
                Thread.sleep(2000);
                i++;
                
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }   
    }
}
