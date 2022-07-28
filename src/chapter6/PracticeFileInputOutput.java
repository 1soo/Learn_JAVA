package chapter6;

import java.io.IOException;

import java.io.BufferedReader;
import java.io.FileReader;

public class PracticeFileInputOutput {
    public static void main(String[] args) throws IOException{
        /* //FileOutputStream
        FileOutputStream output = new FileOutputStream("c:/Temp/out.txt");
        for(int i = 1; i < 11; i++){
            // 유닉스인 경우 \n만 있어도 되지만 노트패드같은 에디터에서는 \r\n을 해야 줄바꿈이 제대로 표시된다.
            String data = i + " 번째 줄입니다.\r\n";
            // FileOutputStream에 값을 쓸 때는 int, byte배열로 써야한다.
            output.write(data.getBytes());
        }
        output.close();*/
        /* // FileWriter
        FileWriter fw = new FileWriter("c:/Temp/out.txt");
        for(int i = 1; i< 11; i++){
            String data = i + "번째 줄입니다.\r\n";
            // FileWriter는 byte배열 대신 문자열을 사용할 수 있다.
            fw.write(data);
        }
        fw.close();*/
        /* // PrintWriter
        PrintWriter pw = new PrintWriter("C:/Temp/out.txt");
        for(int i = 1; i < 11; i++){
            String data = i + " 번째 줄입니다.";
            // /r/n을 안넣어도 줄바꿈이 가능하다.
            pw.println(data);
        }
        pw.close();*/
        /*// FileWriter(내용 추가)
        // FileWriter 생성자 입력에 true를 추가하면 새로 쓰기가 아닌 이어쓰기모드이다.
        FileWriter fw2 = new FileWriter("c:/Temp/out.txt", true);
        for(int i = 11; i < 21; i++){
            String data = i + " 번째 줄입니다.\r\n";
            fw2.write(data);
        }
        fw2.close();*/
        /*// PrintWriter(내용 추가)
        // PrintWriter의 생성자 파라미터에 파일명 대신 이어쓰기 모드인FileWriter의 객체 전달해야함.
        PrintWriter pw2 = new PrintWriter(new FileWriter("c:/Temp/out.txt", true));
        for(int i = 11; i < 21; i++){
            String data = i + " 번째 줄입니다.";
            pw2.println(data);
        }
        pw2.close()*/
        /*// FileInputStream
        // byte 배열로 읽어야하고 스트링으로 다시 변환해야함.
        byte[] b = new byte[1024];
        FileInputStream input = new FileInputStream("c:/Temp/out.txt");
        input.read(b);
        System.out.println(new String(b));
        input.close();*/
        // BufferedReader과 FileReader의 조합을 사용해서 라인단위로 읽음.
        BufferedReader br = new BufferedReader(new FileReader("c:/Temp/out.txt"));
        while(true){
            String line = br.readLine();
            if(line == null)break;
            System.out.println(line);
        }
        br.close();
    }
}
