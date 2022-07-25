import java.util.*;

public class Practice_If {
    public static void main(String[] args){
        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("paper");
        pocket.add("smartphone");
        pocket.add("money");

        if(pocket.contains("money") || pocket.contains("card")){
            System.out.println("Take Taxi");
        }
        else if(pocket.contains("smartphone")){
            System.out.println("Call your friend");
        }
        else{
            System.out.println("Walk to home");
        }
    }
}
