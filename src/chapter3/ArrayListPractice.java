package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListPractice {
    public static void main(String[] args){
        String[] data = {"138", "129", "142"};
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
        pitches.sort(Comparator.naturalOrder());
        System.out.println(pitches);
    }
}
