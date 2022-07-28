package chapter8;

import java.util.Scanner;

public class exam4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String sb = sc.nextLine();
        Integer count = 0;

        for(Integer i = 0; i < sb.length(); i++){
            if(sb.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("answer : " + count);
        sc.close();
    }
}
