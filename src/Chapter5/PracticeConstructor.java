package Chapter5;

class Human{
    String name;

    void setName(String name){
        this.name = name;
    }
}
class Kid extends Human{
    void Say(){
        System.out.println(this.name + "said Hello!");
    }
}
class KindergardenKid extends Kid{
    // 생성자
    KindergardenKid(String name){
        this.setName(name);
    }
    KindergardenKid(int type){
        if(type == 1){
            this.setName("boy");
        }
        else if(type == 2){
            this.setName("girl");
        }
    }
    void Say(){
        System.out.println(this.name + " said blabla..");
    }
    void Say(int minuite){
        System.out.println(this.name + " said blabla.." +
                " and cried for " + minuite + "minuites") ;
    }
}
public class PracticeConstructor {
    public static void main(String[] args){
        KindergardenKid baby1 = new KindergardenKid("Roy");
        System.out.println(baby1.name);
        baby1.Say();
        baby1.Say(3);
        System.out.println();
        KindergardenKid baby2 = new KindergardenKid(1);
        System.out.println(baby2.name);
        baby2.Say();
        baby2.Say(5);
    }
}
