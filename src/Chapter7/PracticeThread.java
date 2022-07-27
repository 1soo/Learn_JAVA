package Chapter7;
// 프로세스 : 동작하고 있는 프로그램
// 쓰레드 : 보통 한 개의 프로세스는 한 가지 일을 하지만
// 쓰레드를 이용하면 한 프로세스 내에서 두 가지 또는 그 이상의 일을 동시에 할 수 있다.
import java.util.ArrayList;

class test_Thread extends Thread{
    int seq;

    public test_Thread(int seq){
        this.seq = seq;
    }
    public void run(){
        System.out.println(this.seq + " thread run.");
        try{
            Thread.sleep(1000);
        }catch(Exception e){
        }
        System.out.println(this.seq + " thread end.");
    }
}

public class PracticeThread{
    public static void main(String[] args){
        ArrayList<Thread> threads = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            Thread t = new test_Thread(i);
            t.start();
            threads.add(t);
        }
        for(int i = 0; i < threads.size(); i++){
            Thread t = threads.get(i);
            try{
                // join으로 thread가 모두 종료될때까지 main종료 안하게 하기
                t.join();
            }catch(Exception e){

            }
        }
        System.out.println("main end.");
    }
}
