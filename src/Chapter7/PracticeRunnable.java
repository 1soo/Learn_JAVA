package Chapter7;
// Thread 클래스를 상속하면 다른 클래스를 상속할 수 없기 때문에 Runnable 인터페이스를 사용
import java.util.ArrayList;

class Sample implements Runnable{
    int seq;
    public Sample(int seq){
        this.seq = seq;
    }
    public void run(){
        System.out.println(this.seq + " thread start. ");
        try{
            Thread.sleep(1000);
        }catch(Exception e){}
        System.out.println(this.seq + " thread end. ");
    }
}
public class PracticeRunnable {
    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Thread t = new Thread(new Sample(i));
            t.start();
            threads.add(t);
        }

        for(int i = 0; i < threads.size(); i++){
            Thread t = threads.get(i);
            try{
                t.join();
            }catch(Exception e){}
        }
        System.out.println(" main end. ");
    }
}
