package Chapter7;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
// 함수형 프로그래밍을 지원하기위해 람다 도입.
// 람다 함수로 사용할 인터페이스는 함수를 하나만 사용할 수있다.
// @FunctionInterface 어노테이션을 사용한 인터페이스는 2개 이상의 메소드를 가질 수 없다.
/*@FunctionalInterface
interface Calculator{
    int sum(int a, int b);
}*/

public class PracticeLambda {
    public static void main(String[] args){
        // 람다 적용한 코드
        //Calculator mc = (int a, int b) -> a + b;
        // BiFunction 인터페이스 <입력항목, 입력항목, 출력항목>
        //BiFunction<Integer, Integer, Integer> mc = (a, b) -> a + b;
        // 입출력 항목의 타입이 동일할 경우 BinaryOperator 사용 가능
        BinaryOperator<Integer> mc = (a, b) -> a + b;
        int result = mc.apply(3, 4);
        System.out.println(result);
    }
}
