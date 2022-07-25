import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        map.put("input", "수입");
        map.put("place", "구장");
        System.out.print("키에 people이 있나요? ");
        System.out.println(map.containsKey("people"));
        System.out.print("삭제된 people의 value: ");
        System.out.println(map.remove("people"));
        System.out.print("map의 크기 : ");
        System.out.println(map.size());
        System.out.println(map.keySet());
    }
}
// LinkedHashMap : 입력된 순서대로 데이터 저장
// TreeMap : 입력된 Key의 오름차순대로 데이터 저장