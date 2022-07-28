package chapter8;

public class exam2 {
    Integer getTotalPage(Integer m, Integer n){
        if(m % n == 0){
            return m /n;
        }
        else{
            return m / n + 1;
        }
    }
    public static void main(String[] args){
        exam2 ex2 = new exam2();
        System.out.println("check : " + ex2.getTotalPage(5, 10));
        System.out.println("check : " + ex2.getTotalPage(15, 10));
        System.out.println("check : " + ex2.getTotalPage(25, 10));
        System.out.println("check : " + ex2.getTotalPage(30, 10));
    }
}
