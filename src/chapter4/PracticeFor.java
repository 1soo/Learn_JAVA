package chapter4;

public class PracticeFor {
    public static void main(String[] args){
        int[] marks = { 90, 25, 67, 45, 80 };
        for(int i = 0; i < marks.length; i++){
            if(marks[i] > 60){
                System.out.println("Student no." + (i + 1)
                        + "Congratulation!! You are Passed.");
            }
        }
    }
}
