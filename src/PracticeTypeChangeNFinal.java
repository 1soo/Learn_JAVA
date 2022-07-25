import java.util.ArrayList;
import java.util.Arrays;
public class PracticeTypeChangeNFinal {
    public static void main(String[] args){
        final String num = "123";
        int n = Integer.parseInt(num);
        float f = (float)n;
        System.out.println(n);
        System.out.printf("%.2f", f);
        System.out.println();
        final ArrayList<String> li = new ArrayList<>
                (Arrays.asList("A", "B"));
        System.out.println(li);
        // List.of가 잘 작동하지 않아 ArrayList로 배열을 선언함
    }
}
