package chapter6;

import java.io.IOException;

import java.util.*;
import java.io.*;

public class Quiz6th {
    public static void main(String[] args) throws IOException{
        // Q1
        /*Scanner sc1 = new Scanner(System.in);
        Integer a1, b1;
        a1 = sc1.nextInt();
        b1 = sc1.nextInt();
        System.out.println("Q1 -> " + a1 + " + " + b1 + " = " + (a1 + b1));
        sc1.close();*/

        /*// Q2
        Scanner sc2 = new Scanner(System.in);
        String strTemp2;
        while(!(strTemp2 = sc2.nextLine()).equals("END")){
            strTemp2 = strTemp2.toUpperCase();
            System.out.println(strTemp2);
        }
        sc2.close();*/

        // Q3
        /*FileWriter fw3 = new FileWriter("c:/Temp/sample.txt");
        fw3.write("Write once, run anywhere");
        fw3.close();

        BufferedReader br3 = new BufferedReader(new FileReader("c:/Temp/sample.txt"));
        String line = br3.readLine();
        System.out.println("Q3 -> " + line);
        br3.close();*/

        /*// Q4
        String strTemp4;
        Scanner sc4 = new Scanner(System.in);
        strTemp4 = sc4.nextLine();
        sc4.close();

        PrintWriter pw4 = new PrintWriter(new FileWriter("c:/Temp/sample4.txt", true));
        pw4.println(strTemp4);
        pw4.close();*/

        // Q5
        ArrayList<String> arr5 = new ArrayList<>();
        BufferedReader br5 = new BufferedReader(new FileReader("c:/Temp/sample5.txt"));
        String line5;
        while((line5 = br5.readLine()) != null){
            if(line5.contains("python")){
                arr5.add(line5.replaceAll("python", "java"));
            }
            else{
                arr5.add(line5);
            }
        }
        br5.close();
        PrintWriter pw5 = new PrintWriter(new FileWriter("c:/Temp/sample5.txt"));
        for (String str:arr5){
            pw5.println(str);
        }
        pw5.close();
    }
}
