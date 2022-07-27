package Chapter2;// Quiz url : https://wikidocs.net/157658
import java.util.*;

public class questionPractice {
    // Q10
    enum Coffee_List{
        AMERICANO,
        ICE_AMERICANO,
        CAFE_RATTE
    };
    static void printCoffeePrice(Coffee_List coffee){
        HashMap<Coffee_List, Integer> Map10 = new HashMap<>();
        Map10.put(Coffee_List.AMERICANO, 3000);
        Map10.put(Coffee_List.ICE_AMERICANO, 4000);
        Map10.put(Coffee_List.CAFE_RATTE, 5000);

        int Coffee_Price = Map10.get(coffee);

        System.out.println("Q10 -> The " + coffee +
                "'s price is " + Coffee_Price + " Won");
    }
    public static void main(String[] args){
        // Q1
        Integer Korean = 80, English = 75, Math = 55, sum = 0;
        sum = Korean + English + Math;
        System.out.println("Q1 -> The Score Average is " + sum / 3);

        // Q2
        Integer num = 13;
        System.out.println("Q2 -> The number " + num + " is " +
                ((num % 2 == 0)?"even":"odd") + "number.");

        // Q3
        String SSN = "881120-1068234";
        System.out.println("Q3 -> " +
                SSN.substring(0, 6) + "-" + SSN.substring(7, 14));

        // Q4
        String pin = "881120-1068234";
        System.out.println("Q4 -> This People is " +
                (pin.substring(7, 8).equals("1")?"male.":"female."));

        // Q5
        String replaceStr = "a:b:c:d";
        System.out.println("Q5 -> " + replaceStr.
                replaceAll(":", "#"));

        // Q6
        ArrayList<Integer> List6 = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        List6.sort(Comparator.reverseOrder());
        System.out.println("Q6 -> " + List6);

        // Q7
        ArrayList<String> List7 = new ArrayList<>
                (Arrays.asList("Life", "is", "too", "short"));
        String List7_merge = "";
        for(int i = 0; i < List7.size(); i++)
        {
            List7_merge += List7.get(i) + " ";
        }
        System.out.println("Q7 -> " + List7_merge);

        // Q8
        HashMap<String, Integer> Map8 = new HashMap<>();
        Map8.put("A", 90);
        Map8.put("B", 80);
        Map8.put("C", 70);
        System.out.println("Q8 -> removed : " + Map8.remove("B")
                            + ", Map keys : " + Map8.keySet());

        // Q9
        ArrayList<Integer> List9 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        HashSet<Integer> List9_Set = new HashSet<>();
        List9_Set.addAll(List9);
        System.out.println("Q9 -> " + List9_Set);

        // Q10
        printCoffeePrice(Coffee_List.AMERICANO);
        printCoffeePrice(Coffee_List.ICE_AMERICANO);
        printCoffeePrice(Coffee_List.CAFE_RATTE);
    }
}
