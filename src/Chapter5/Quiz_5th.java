package Chapter5;

import java.util.*;

class Quiz_Calculator{
    int value;
    Quiz_Calculator(){
        this.value = 0;
    }
    void add(int val){
        this.value += val;
    }
    int getValue(){
        return this.value;
    }
    // Q3
    boolean isOdd(int val){
        if(val % 2 == 0){
            return false;
        }
        return true;
    }
    // Q4
    int avg(int[] data){
        int sum = 0;
        for(int i: data){
            sum += i;
        }
        return sum / data.length;
    }
    int avg(ArrayList<Integer> data){
        int sum = 0;
        for(Integer i: data){
            sum += i;
        }
        return sum / data.size();
    }
}
// Q1
class Quiz_UpgradCalculator extends Quiz_Calculator{
    void minus(int val){
        this.value -= val;
    }
}
// Q2
class Quiz_MaxLimitCalculator extends Quiz_Calculator{
    void add(int val){
        value += val;
        if(value > 100){
            value = 100;
        }
    }
}
// Q6
class Calculator6{
    Integer value = 0;
    void add(int val){
        this.value += val;
    }
    public Integer getValue(){
        return this.value;
    }
}
//  Q7
interface Resource7{
    Integer getValue();
}
class Gold7 implements Resource7{
    public Integer getValue(){
        return 100;
    }
}
class Silver7 implements Resource7{
    public Integer getValue(){
        return 90;
    }
}
class Bronze7 implements Resource7{
    public Integer getValue(){
        return 80;
    }
}
class MineralCalculator7{
    Integer value = 0;

    public void add(Resource7 resource){
        this.value += resource.getValue();
    }
}
// Q8
interface Predator7{}
class Animal7{}
class Dog7 extends Animal7{}
class Lion7 extends Animal7 implements Predator7{}
// Q9
interface Predator9{
    String bark();
}
abstract class Animal9{
    public String hello(){
        return "hello";
    }
}
class Dog9 extends Animal9{}
class Lion9 extends Animal9 implements Predator9{
    public String bark(){
        return "Bark bark!!";
    }
}
public class Quiz_5th {
    public static void main(String[] args){
        // Q1
        Quiz_UpgradCalculator cal1 = new Quiz_UpgradCalculator();
        cal1.add(10);
        cal1.minus(3);
        System.out.println("Q1 -> value : " + cal1.getValue());

        // Q2
        Quiz_MaxLimitCalculator cal2 = new Quiz_MaxLimitCalculator();
        cal2.add(50);
        cal2.add(60);
        System.out.println("Q2 -> value : " + cal2.getValue());

        // Q3
        Quiz_Calculator cal3 = new Quiz_Calculator();
        System.out.print("Q3 -> ");
        if(cal3.isOdd(6)){
            System.out.println("Given number is odd.");
        }
        else{
            System.out.println("Given number is even.");
        }

        // Q4
        int[] data4_1 = {1, 3, 5, 7, 9};
        ArrayList<Integer> data4_2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        Quiz_Calculator cal4 = new Quiz_Calculator();
        int result4_1 = cal4.avg(data4_1), result4_2 = cal4.avg(data4_2);
        System.out.println("Q4 -> average(Array) : " + result4_1);
        System.out.println("Q4 -> average(ArrayList) : " + result4_2);

        // Q5
        ArrayList<Integer> a5 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b5 = a5;
        a5.add(4);
        System.out.println("Q5 -> size : " + b5.size() +
                ", why : because of simple substitution, each ArrayList is connected.");

        // Q6
        Calculator6 cal6 = new Calculator6();
        cal6.add(3);
        System.out.println("Q6 -> Value : " + cal6.getValue() +
                ", why : because Integer's value is null before Initialize");

        // Q7
        MineralCalculator7 cal7 = new MineralCalculator7();
        cal7.add(new Gold7());
        cal7.add(new Silver7());
        cal7.add(new Bronze7());
        System.out.println("Q7 -> Value : " + cal7.value);

        // Q8
        Animal7 a7 = new Animal7();
        Animal7 b7 = new Dog7();
        Animal7 c7 = new Lion7();
        //Chapter5.Dog7 d7 = new Chapter5.Animal7();
        Predator7 e = new Lion7();
        System.out.println("Q8 -> 4, because subclass can't have superclass constructor");

        // Q9
        Animal9 a9 = new Lion9();
        Lion9 b9 = new Lion9();
        Predator9 c9 = new Lion9();

        System.out.println("Q9 -> \n-execution-");
        System.out.println(a9.hello());
        //System.out.println(a9.bark());
        System.out.println(b9.hello());
        System.out.println(b9.bark());
        //System.out.println(c9.hello());
        System.out.println(c9.bark());
        System.out.println("-answer-\n3, 5\n" +
                "2's datatype is Chapter5.Animal(Chapter5.Animal doesn't have method-bark()\n" +
                "4's datatype is Chapter5.Predator(Chapter5.Predator doesn't have method-hello()");
    }
}
