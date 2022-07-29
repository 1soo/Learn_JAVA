package chapter9;
// 문제 출처 : https://wikidocs.net/158091
import java.util.*;
import java.io.*;

// Q9
/*class Calculator{
    ArrayList<Integer> arr = new ArrayList<>();
    Calculator(int[] data){
        for(Integer i : data){
            arr.add(i);
        }
    }
    Integer sum(){
        Integer sumArr = 0;
        for(Integer i : arr){
            sumArr += i;
        }
        return sumArr;
    }
    Float avg(){
        return this.sum().floatValue() / arr.size();
    }
}*/

// Q10
/*class OddException extends Exception{}*/

// Q15
/*class encryption_tool{
    String sieger(String str, Integer n){
        StringBuilder result = new StringBuilder();
        Integer tmp;
        for(Integer i = 0; i < str.length(); i++){
            tmp = str.charAt(i) + n;
            if(tmp > 90){
                tmp -= 26;
            }
            result.append(Character.toChars(tmp));
        }
        return result.toString();
    }
}*/

public class SolveQuiz {
    // Q5
    /*void GuGu(Integer n){
        for(Integer i = 1; i <= 9; i++){
            System.out.print((n * i) + " ");
        }
    }*/

    // Q10
    /*static void excute(int n) throws OddException{
        System.out.printf("입력 숫자 : %d\n", n);
        if( n % 2 == 1){
            System.out.println("홀수입니다.");
            throw new OddException();
        }
        System.out.println("짝수입니다.");
    }*/
    public static void main(String[] args){
        // Q1
        /*String s1 = "a:b:c:d";
        System.out.println("Q1 : " + s1.replaceAll(":", "#"));*/

        // Q2
        /*HashMap<String, Integer> a = new HashMap<>();
        a.put("A", 90);
        a.put("B", 80);
        System.out.println("Q2 -> " + ((a.get("c") == null)?"70":a.get("c")));*/

        // Q3
        /*int[] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};
        int sum = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] >= 50){
                sum += A[i];
            }
        }
        System.out.println("Q3 -> " + sum);*/

        // Q4
        /*Integer n1, n2 = 1, tmp = 0;
        Integer n = 100;
        System.out.print("Q4 -> ");
        do{
            System.out.print(tmp + " ");
            n1 = n2;
            n2 = tmp;
        }while((tmp = n1 + n2) < n);*/

        // Q5
        /*SolveQuiz sq = new SolveQuiz();
        System.out.print("Q5 -> 구구단을 출력할 숫자(2) = ");
        sq.GuGu(2);*/

        // Q6
        /*// split은 문자 나누기, concat은 문자 이어 붙이기
        String str1 = "65,45,2,3,45,8";
        String[] str2 = str1.split(",");
        Integer sum = 0;
        for(Integer i = 0; i < str2.length; i++){
            sum += Integer.parseInt(str2[i]);
        }
        System.out.println("Q6 -> " + sum);*/

        // Q7
        // BufferedReader은 한 문장씩 읽기 편하고, PrintWriter는 한 문장씩 쓰기 편하다.
        // 단, 둘은 객체 생성할때(각각 FileReader과 FileWriter(이어쓰기 or 새로쓰기)를 생성 인자에 넣는 것이 편하다.)
        /*try {
            BufferedReader br = new BufferedReader(new FileReader("c:/Temp/abc.txt"));
            ArrayList<String> arr = new ArrayList<>();
            String tmpStr;
            while(true){
                tmpStr = br.readLine();
                if(tmpStr == null){
                    break;
                }
                arr.add(tmpStr);
            }
            br.close();
            arr.sort(Comparator.reverseOrder());
            PrintWriter pw = new PrintWriter(new FileWriter("c:/Temp/result.txt"), false);
            for(Integer i = 0; i < arr.size(); i++){
                pw.println(arr.get(i));
            }
            pw.close();
            System.out.println("File saved Successfully");
        }catch(IOException e){
            System.out.println("File not found");
        }*/

        // Q8
        /*try {
            BufferedReader br = new BufferedReader(new FileReader("c:/Temp/abc8.txt"));
            String tmp;
            ArrayList<Integer> arr = new ArrayList<>();
            while(true){
                tmp = br.readLine();
                if(tmp == null){
                    break;
                }
                arr.add(Integer.parseInt(tmp));
            }
            br.close();
            PrintWriter pw = new PrintWriter(new FileWriter("c:/Temp/result8.txt", false));
            Integer sum = 0;
            for(Integer i: arr){
                sum += i;
            }
            pw.println("average of abc8.txt : " + (float)sum/arr.size());
            pw.close();
        }catch(IOException e){
            e.printStackTrace();
        }*/

        // Q9
        /*System.out.println("Q9 -> ");
        int[] data1 = {1, 2, 3, 4, 5};
        Calculator cal1 = new Calculator(data1);
        System.out.println(cal1.sum());
        System.out.println(cal1.avg());

        int[] data2 = {6, 7, 8, 9, 10};
        Calculator cal2 = new Calculator(data2);
        System.out.println(cal2.sum());
        System.out.println(cal2.avg());*/

        // Q10
        /*System.out.println("Q10 -> ");
        Random r = new Random();
        for(int i = 0; i < 10; i++) {
            try {
                excute(r.nextInt(10));
            } catch (OddException e) {
                e.printStackTrace();
            }
        }*/

        // Q11
        /*String arrInt = "4546793";
        StringBuilder arrString = new StringBuilder();
        for(Integer i = 0; i < arrInt.length(); i++){
            arrString.append(arrInt.charAt(i));
            if(i < arrInt.length() - 1){
                if(arrInt.charAt(i) % 2 == 0 && arrInt.charAt(i + 1) % 2 == 0){
                    arrString.append('*');
                }
                else if(arrInt.charAt(i) % 2 != 0 && arrInt.charAt(i + 1) % 2 != 0){
                    arrString.append('-');
                }
            }
        }
        System.out.println("Q11 -> " + arrString);*/

        // Q12
        /*String str = "aaabbcccccca";
        StringBuilder sb = new StringBuilder();
        Character compChar = str.charAt(0);
        Integer cnt = 1;
        sb.append(compChar);
        for(Integer i = 1; i < str.length(); i++){
            if(str.charAt(i) == compChar){
                cnt++;
            }
            else{
                sb.append(cnt);
                cnt = 1;
                compChar = str.charAt(i);
                sb.append(compChar);
            }
            if(i == str.length() - 1){
                sb.append(cnt);
            }
        }
        System.out.println("Q12 -> " + sb);*/

        // Q13
        /*String str = "0123456789 01234 01234567890 6789012345 012322456789";

        String[] strArr = str.split(" ");
        Integer[] cntArr = new Integer[10];
        boolean isDuplicate;

        for(Integer j = 0; j < 10; j++){
            cntArr[j] = 0;
        }

        System.out.print("Q13 -> ");

        for(Integer i = 0; i < strArr.length; i++){
            isDuplicate = true;
            for(Integer j = 0; j < strArr[i].length(); j++){
                cntArr[strArr[i].charAt(j) - 48]++;
                if(cntArr[strArr[i].charAt(j) - 48] > 1){
                    isDuplicate = false;
                }
            }
            for(Integer j = 0; j < 10; j++){
                if(cntArr[j] == 0){
                    isDuplicate = false;
                    cntArr[j] = 0;
                }
            }
            System.out.print(isDuplicate + " ");
        }*/

        // Q14
        /*String data = ".... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--";

        HashMap<String, Character> map = new HashMap<>();
        map.put(".-", 'A');map.put("-...", 'B');map.put("-.-.", 'C');
        map.put("-..", 'D');map.put(".", 'E');map.put("..-.", 'F');
        map.put("--.", 'G');map.put("....", 'H');map.put("..", 'I');
        map.put(".---", 'J');map.put("-.-", 'K');map.put(".-..", 'L');
        map.put("--", 'M');map.put("-.", 'N');map.put("---", 'O');
        map.put(".--.", 'P');map.put("--.-", 'Q');map.put(".-.", 'R');
        map.put("...", 'S');map.put("-", 'T');map.put("..-", 'U');
        map.put("...-", 'V');map.put(".--", 'W');map.put("-..-", 'X');
        map.put("-.--", 'Y');map.put("--..", 'Z');

        String[] arrWord = data.split("  ");
        String[] arrChar;

        System.out.print("Q14 -> ");
        for(Integer i = 0; i < arrWord.length; i++){
            arrChar = arrWord[i].split(" ");
            for(Integer j = 0; j < arrChar.length; j++){
                System.out.print(map.get(arrChar[j]));
            }
            System.out.print(" ");
        }*/

        // Q15
        /*encryption_tool et = new encryption_tool();
        System.out.println(et.sieger("CAT", 5));
        System.out.println(et.sieger("XYZ", 3));*/

    }
}
