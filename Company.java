public class Company {

    public int n;

    boolean f = false; // means Producer is producing
    //true means Consumer is consuming

    synchronized public void produceItem(int item) throws InterruptedException{
        if(f==true){
            wait();
        }
        this.n = item;
        System.out.println("The produced item is : " + this.n);

        f = true;
        notify(); // the thread which is waiting which is consumer.
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    synchronized public int consumeItem(){
        if(f==false){
            try {
                wait();   
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("The consumed item is : " + this.n);
        f = false;
        notify(); //send communication to producer thread to execute.
        return this.n;
    }

}
