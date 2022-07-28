package chapter6;// 콘솔에서 사용자에게 보여주는 것은 콘솔출력, 콘솔에 사용자가 입력하는 것은 콘솔 입력
// main에서 발생하는 IOException은 나중으로 throw한다.
import java.io.IOException;
// 1개 입력받을 때는 int, 여러개는 byte[]로 받는다.
// char[]의 배열크기만큼 입력받는다.
// String을 이용하고 사용자가 Enter키를 누를 때까지 입력받는다.
// 데이터 타입에 구애받지않고 입력받는다.


public class PracticeInputOutput {
    public static void main(String[] args) throws IOException{
        /*InputStream in = System.in;
          int a; a = in.read(a);
          byte[] a = new byte[3]; in.read(a)*/
        /* // 객체 생성시 생성자의 입력으로 InputStream의 객체 이용
          InputStreamReader reader = new InputStreamReader(in);
          char[] a = new char[3]; reader.read(a);*/
        /* // 객체 생성시 생성자의 입력으로 InputStreamReader의 객체 이용
          BufferedReader br = new BufferedReader(reader);
          String a = br.readLine();*/
        /*// next:단어, nextLine:라인, nextInt:정수
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt());*/
        System.out.println("일반 출력");
        System.err.println("에러 출력");
    }
}
