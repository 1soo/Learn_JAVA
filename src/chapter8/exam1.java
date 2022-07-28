package chapter8;

public class exam1{
    public static void main(String[] args){
        Integer num = 3, sum = 0;
        while(num < 1000){
            if(num % 3 == 0 || num % 5 == 0){
                sum += num;
            }
            num ++;
        }
        System.out.println("sum : " + sum);
    }
}