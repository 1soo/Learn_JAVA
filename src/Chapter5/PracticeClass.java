package Chapter5;

class Animal{
    String name;

    public void setName(String name){
        this.name = name;
    }
}

public class PracticeClass {
    public static void main(String[] args){
        Animal cat = new Animal();
        Animal dog = new Animal();

        cat.setName("boby");
        dog.name = "happy";

        // 서로 다른 객체의 변수는 공유되지 않는다.
        System.out.println(cat.name);
        System.out.println(dog.name);
    }
}
