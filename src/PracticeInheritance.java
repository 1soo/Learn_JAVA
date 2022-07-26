class Animals{
    String name;

    void setName(String name){
        this.name = name;
    }
}
class Dog extends Animal{
    void sleep(){
        System.out.println(this.name + "-zzz..");
    }
}
class HouseDog extends Dog{
    void sleep(){
        System.out.println(this.name + "-zzz.. in house");
    }
    void sleep(int hour){
        System.out.println(this.name + "-zzz... in house for "
                        + hour + "hours");
    }
}
public class PracticeInheritance {
    public static void main(String[] args){
        Animals parents = new Animals();
        Dog dog = new Dog();
        HouseDog houseDog = new HouseDog();

        parents.setName("poppyDad");
        dog.setName("poppy");
        houseDog.setName("happy");

        System.out.println(parents.name);
        System.out.println(dog.name);
        System.out.println(houseDog.name + '\n');

        dog.sleep();
        // 오버라이딩
        houseDog.sleep();
        // 오버로딩
        houseDog.sleep(3);
    }
}
