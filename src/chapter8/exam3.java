package chapter8;

public class exam3 {
    Integer getN(Integer n){
        String count = "" + n;
        return count.length();
    }
    public static void main(String[] args){
        exam3 ex3 = new exam3();
        System.out.println("check : " + ex3.getN(3));
        System.out.println("check : " + ex3.getN(25));
        System.out.println("check : " + ex3.getN(333));
        System.out.println("check : " + ex3.getN(7876));
    }
}
