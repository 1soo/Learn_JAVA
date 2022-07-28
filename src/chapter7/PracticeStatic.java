package chapter7;

import java.text.SimpleDateFormat;
import java.util.Date;

// static 변수는 어떤 객체이던지 동일한 값이 들어간다.(앞에 final을 붙이면 변경 불가)
// static 메소드는 객체 생성 없이 클래스를 통해 메소드를 직접 호출할 수 있다.
// static 메소드는 static 변수에만 접근 가능하다.
// (메모리 할당을 한 번만 하므로 메모리 사용에 이점)

class Counter{
    static int count = 0;
    Counter(){
        this.count++;
        System.out.println(this.count);
    }
    public static int getCount(){
        return count;
    }
}

class Util{
    public static String getCurrentDate(String fmt){
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
}
public class PracticeStatic {
    public static void main(String[] args){
        /*Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println(Counter.getCount());*/
        System.out.println(Util.getCurrentDate("yyyyMMdd"));
    }
}
