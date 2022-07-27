package Chapter7;
// try{}catch{}finally{}:
// finally문은 오류의 발생여부와 상관없이 무조건 실행되고,
// try 안에서 오류가 발생하면 해당하는 오류의 catch문이 실행된다.
// 오류가 발생하지 않으면 catch문은 실행되지 않는다.

class print_finally{
    public void shouldBeRun(){
        System.out.println("ok thanks.");
    }
    public void sayNick(String nick) throws FoolException{
            if ("fool".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("당신의 별명은 " + nick + "입니다.");
    }
}
// Exception은 크게 RuntimeException, Exception으로 나뉜다.
// RuntimeException은 실행시 발생하는 예외이다.(발생할 수도 있고 안할 수도 있는 경우 작성)
// Exception은 컴파일시 발생하는 예외이다.(이미 예측가능한 예외를 작성할 떄)
class FoolException extends RuntimeException{}

public class PracticeException {
    public static void main(String[] args){
        /*
        int c;
        print_finally pf = new print_finally();
        try{
            c = 4 / 0;
        }catch(ArithmeticException e){
            c = -1;
        }finally{
            pf.shouldBeRun();
        }
        System.out.println(c);*/
        print_finally pf = new print_finally();
        try {
            pf.sayNick("fool");
            pf.sayNick("fool");
        }catch(FoolException e){
            System.err.println("FoolException이 발생했습니다.");
        }
    }
}
