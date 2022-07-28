package chapter3;

import java.util.Arrays;
import java.util.HashSet;

public class SetPractice {
    public static void main(String[] args){
        HashSet<Integer> s1 = new HashSet<>
                (Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>
                (Arrays.asList(4, 5, 6, 7, 8, 9));
        // 교집합
        HashSet<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.print("s1 & s2 교집합 : ");
        System.out.println(intersection);
        // 합집합
        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.print("s1 + s2 합집합 : ");
        System.out.println(union);
        // 차집합
        HashSet<Integer> subtract = new HashSet<>(s1);
        subtract.removeAll(s2);
        System.out.print("s1 - s2 차집합 : ");
        System.out.println(subtract);
    }
}
