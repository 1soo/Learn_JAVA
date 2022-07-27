package Chapter5;

public class PracticeMethod {
    int d;
    int sum(int a, int b){
        return a + b;
    }
    void addD(){
        this.d++;
    }
    public static void main(String[] args){
        int a = 3;
        int b = 4;

        PracticeMethod method = new PracticeMethod();
        int c = method.sum(a, b);
        method.d = 3;
        method.addD();

        System.out.println("a + b = " + c);
        System.out.println("d = " + method.d);
    }
}
