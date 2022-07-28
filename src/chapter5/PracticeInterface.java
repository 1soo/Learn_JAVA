package chapter5;

/*
interface의 default함수는 implement된 class들이 사용할 수 있지만
static 함수는 implement된 class들이 사용할 수 없다.
(static 변수는 사용 가능)
 */
interface Predator{
    String getFood();
    String getName();
    default void printFood(){
        System.out.printf("my food is %s", getFood());
    }

    int Leg_Count = 4;

    default void printLeg(){
        System.out.println("a count of my leg is " + Leg_Count);
    }
    static int speed(){
        return Leg_Count * 30;
    }
}
interface Barkable{
    void bark();
}
interface BarkablePredator extends Predator, Barkable{
}
class zooAnimal{
    String name;

    void setName(String name){
        this.name = name;
    }
}
class Tiger extends zooAnimal implements BarkablePredator{
    Tiger(String name){
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
    int speed(){
        return Leg_Count * 50;
    }
    public void bark(){
        System.out.println("어흥");
    }
}
class Lion extends zooAnimal implements BarkablePredator{
    Lion(String name){
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
class Crocodile extends zooAnimal implements BarkablePredator{
    Crocodile(String name){
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
class ZooKeeper{
    String name;
    ZooKeeper(String name){
        this.name = name;
    }
    void feed(BarkablePredator predator){
        System.out.println(name + " feed " + predator.getFood()
                + " in " + predator.getName());
    }
}

class Bouncer{
    void barkAnimal(BarkablePredator animal){
        animal.bark();
    }
}

public class PracticeInterface {
    public static void main(String[] args){
        ZooKeeper zookeeper = new ZooKeeper("Julie");
        Tiger tiger = new Tiger("tiger");
        Lion lion = new Lion("lion");
        Crocodile crocodile = new Crocodile("crocodile");

        tiger.printFood();
        zookeeper.feed(tiger);
        System.out.println("tiger's legCount is " + tiger.Leg_Count + " and tiger's speed is " + tiger.speed());
        System.out.println();

        lion.printFood();
        zookeeper.feed(lion);
        System.out.print("lion's legCount is ");
        lion.SayLegCount();
        System.out.println();

        crocodile.printFood();
        zookeeper.feed(crocodile);
        System.out.println();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
        bouncer.barkAnimal(crocodile);
    }
}
