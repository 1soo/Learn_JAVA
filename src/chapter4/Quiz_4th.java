package chapter4;

public class Quiz_4th {
    public static void main(String[] args){
        // Q1
        String a = "write once, run anywhere";
        if(a.contains("wife")){
            System.out.println("wife");
        }
        else if(a.contains("once") && !a.contains("run")){
            System.out.println("once");
        }
        else if(!a.contains("everywhere")){
            System.out.println("Q1 -> everywhere");
        }
        else if(a.contains("anywhere")){
            System.out.println("anywhere");
        }
        else{
            System.out.println("none");
        }

        // Q2
        int num2 = 1, sum2 = 0;
        while(num2 <= 100){
            if(num2 % 3 == 0){
                sum2 += num2;
            }
            num2++;
        }
        System.out.println("Q2 -> " + sum2);

        // Q3
        int maxnum3 = 5;
        System.out.println("Q3 -> ");
        for(int i = 0; i < maxnum3; i++){
            System.out.print("       ");
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Q4
        System.out.print("Q4 -> ");
        for(int i = 1; i <= 100; i++)
        {
            System.out.print(i + " ");
            if(i % 10 == 0){
                System.out.println();
            }
        }
        // Q5
        int[] marks = { 70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int sum5 = 0;
        for(int i: marks){
            sum5 += i;
        }
        System.out.println("Q5 -> Average is " + sum5 / 10);
    }
}
