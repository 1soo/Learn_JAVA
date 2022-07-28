package chapter7;

import java.util.*;
// 스트림을 이용하여 복잡한 연산과정을 한문장으로 정리할 수 있다.
// .stream으로 Stream을 만들어야 한다.
public class PracticeStream {
    public static void main(String[] args){
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        /*HashSet<Integer> dataSet = new HashSet<>();
        for(int i = 0; i < data.length; i++){
            dataSet.add(data[i]);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : dataSet){
            if(i % 2 == 0){
                arr.add(i);
            }
        }
        arr.sort(Comparator.reverseOrder());
        int[] result = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            result[i] = arr.get(i);
        }*/
        // IntStream 생성
        int[] result = Arrays.stream(data)
                // IntegerStream으로 변경(Comparaator에서 원시타입 못쓰기 때문)
                .boxed()
                // 같은 숫자 제거
                .distinct()
                // 짝수 걸러내기
                .filter((a) -> a % 2 == 0)
                // 역순 배열
                .sorted(Comparator.reverseOrder())
                // int배열이기 때문에 다시 int로 변경
                .mapToInt(Integer::intValue)
                // 배열로 반환
                .toArray();
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
