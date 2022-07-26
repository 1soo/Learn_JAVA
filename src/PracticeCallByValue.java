class Updater1{
    void update(int count){
        count++;
    }
}
class Updater2{
    void update(Counter counter){
        counter.count++;
    }
}
class Counter{
    int count = 0;
}
public class PracticeCallByValue {
    public static void main(String[] args){
        Counter myCounter = new Counter();
        System.out.println("before increase : " + myCounter.count);

        Updater1 myUpdater1 = new Updater1();
        myUpdater1.update(myCounter.count);
        System.out.println("after increase by Updater1(Call by Value) : "
                            + myCounter.count);

        Updater2 myUpdater2 = new Updater2();
        myUpdater2.update(myCounter);
        System.out.println("after increase by Updater2(Call by reference) : "
                + myCounter.count);
    }
}
