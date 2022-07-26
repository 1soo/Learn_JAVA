/* 추상클래스는 인터페이스와 달리 객체변수, 생성자, private메소드를 가질 수 있다
*  멤버변수(전역변수) , 객체변수 = 클래스 내에서 선언된 변수.*/
abstract class Predator1 extends zooAnimal1{
    abstract String getFood();
    abstract String getName();
    void printFood(){
        System.out.printf("my food is %s", getFood());
    }

    static int Leg_Count = 4;

    void printLeg(){
        System.out.println("a count of my leg is " + Leg_Count);
    }
    static int speed(){
        return Leg_Count * 30;
    }
}
interface Barkable1 {
    void bark();
}
class zooAnimal1{
    String name;

    void setName(String name){
        this.name = name;
    }
}
class Tiger1 extends Predator1 implements Barkable1{
    Tiger1(String name){
        this.name = name;
    }
    public String getFood(){
        return "apple";
    }
    public String getName(){
        return name;
    }
    public void printFood(){
        System.out.println(this.name + " said my food is " + getFood());
    }
    static int speed(){
        return Leg_Count * 50;
    }
    public void bark(){
        System.out.println("어흥");
    }
}
class Lion1 extends Predator1 implements Barkable1{
    Lion1(String name){
        this.name = name;
    }
    void SayLegCount(){
        System.out.println(Leg_Count);
    }
    public String getFood(){
        return "banana";
    }
    public String getName(){
        return name;
    }
    public void printFood(){
        System.out.println(this.name + " said my food is " + getFood());
    }
    public void bark(){
        System.out.println("으르렁");
    }
}
class Crocodile1 extends Predator1 implements Barkable1{
    Crocodile1(String name){
        this.name = name;
    }
    public String getFood(){
        return "grape";
    }
    public String getName(){
        return name;
    }
    public void printFood(){
        System.out.println(this.name + " said my food is " + getFood());
    }
    public void bark(){
        System.out.println("쩝쩝");
    }
}
class ZooKeeper1{
    String name;
    ZooKeeper1(String name){
        this.name = name;
    }
    void feed(Predator1 predator){
        System.out.println(name + " feed " + predator.getFood()
                + " in " + predator.getName());
    }
}

class Bouncer1{
    void barkAnimal(Barkable1 animal){
        animal.bark();
    }
}

public class PracticeAbstractClass {
    public static void main(String[] args){
        ZooKeeper1 zookeeper1 = new ZooKeeper1("Julie");
        Tiger1 tiger1 = new Tiger1("tiger");
        Lion1 lion1 = new Lion1("lion");
        Crocodile1 crocodile1 = new Crocodile1("crocodile");

        tiger1.printFood();
        zookeeper1.feed(tiger1);
        System.out.println("tiger's legCount is " + tiger1.Leg_Count + " and tiger's speed is " + tiger1.speed());
        System.out.println();

        lion1.printFood();
        zookeeper1.feed(lion1);
        System.out.print("lion's legCount is ");
        lion1.SayLegCount();
        System.out.println();

        crocodile1.printFood();
        zookeeper1.feed(crocodile1);
        System.out.println();

        Bouncer1 bouncer = new Bouncer1();
        bouncer.barkAnimal(tiger1);
        bouncer.barkAnimal(lion1);
        bouncer.barkAnimal(crocodile1);
    }
}
