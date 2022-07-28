package chapter7;

import java.util.*;

class HeavyWork implements Runnable{
    String name;
    HeavyWork(String name){
        this.name = name;
    }
    public void run(){
        for(int i = 0; i < 5; i++){
            try{
                Thread.sleep(100);
            }catch(Exception e){}
        }
        System.out.printf("%s done.\n", this.name);
    }
}
@FunctionalInterface
interface cal7th{
    int mul(int a, int b);
}
public class Quiz7th {
    public static void main(String[] args){
        // Q1
        /*PracticeMethod pm = new PracticeMethod();
        System.out.println("Q1 -> " + pm.sum(3, 5));
        System.out.println("변수가 protected라서 다른 패키지의 아무 연관없는 클래스가 접근할 수 없다.");*/

        //Q2
        /*int result = 0;
        try{
            int[] a = {1, 2, 3};
            int b = a[3];
            ArrayList c = new ArrayList(Arrays.asList("3"));
            int d = (int)c.get(0);
            int e = 4 / 0;
        }catch(ClassCastException e){
            result += 1;
        }catch(ArithmeticException e){
            result += 2;
        }catch(ArrayIndexOutOfBoundsException e){
            result += 4;
        }finally {
            result += 4;
        }
        System.out.println("Q2 -> " + result);
        System.out.println("int b = a[3]에서 index범위를 잘못 지정했기 때문에 " +
                "\nresult+=4에 해당하는 예외가 발생했고, finally에서 4를 더했기때문에" +
                "\nresult 값은 결국 8이 된다.");*/

        // Q3
        /*System.out.println("Q3 -> ");
        long start = System.currentTimeMillis();
        ArrayList<Thread> th = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            Thread w = new Thread(new HeavyWork("w" + i));
            th.add(w);
            w.start();
        }
        for(int i = 0; i < 4; i++){
            Thread t = th.get(i);
            try{
                t.join();
            }catch(Exception e){}
        }
        long end = System.currentTimeMillis();
        System.out.printf("elapsed time : %s ms\n", end - start);*/

        // Q4
        /*System.out.println("Q4 -> ");
        cal7th c7 = (int a, int b) -> a * b;
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 != 0){
                result[i] = c7.mul(numbers[i], 2);
            }
            else{
                result[i] = numbers[i];
            }
            System.out.println(result[i]);
        }*/

        // Q5
        int[] numbers = {1, -2, 3, -5, 8, -3};
        int[] result = Arrays.stream(numbers)
                .filter((a) -> a > 0)
                .toArray();
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
