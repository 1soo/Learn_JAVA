package chapter7;
// Singleton은 단 하나의 객체만을 생성하게 강제하는 패턴
// 처음 getInstance()가 호출되면 one이 null이므로 객체가 생성된다.
// 다시 getInstance()가 호출되면 one이 null이 아니므로 싱글톤 객체인 one을 리턴한다.
class Singleton{
    private static Singleton one;
    private Singleton(){}

    public static Singleton getInstance(){
        if(one == null){
            one = new Singleton();
        }
        return one;
    }
}

public class PracticeSingleton {
    public static void main(String[] args){
        // 생성자를 private로 막았기때문에 컴파일 에러 발생
        // Singleton singleton = new Singleton();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2);
    }
}
