public class MyAnotherThread extends Thread {

    public void run(){
        for(int i = 10 ; i >=1 ; i--){
            System.out.println("hello i am 2nd 3rd thread : " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
