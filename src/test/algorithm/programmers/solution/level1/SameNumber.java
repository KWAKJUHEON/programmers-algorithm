package test.algorithm.programmers.solution.level1;

import java.util.ArrayList;

/**
 * 주어진 배열에 같은 숫자가 있는지 없는지 확인하는 클래스
 * @author JHKwak
 *
 */
public class SameNumber {
    
    /**
     * 주어진 배열에 같은 숫자가 있는지 없는지 확인하는 프로그램을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 8
     */
    public void run() {
        int[] testArray1 = {1, 1, 3, 3, 0, 1, 1};
        for(int item: solution(testArray1)) {
            System.out.print(item + "/");
        }
        System.out.println();
        int[] testArray2 = {4, 4, 4, 3, 3};
        for(int item: solution(testArray2)) {
            System.out.print(item + "/");
        }
    }
    
    /**
     * 주어진 배열에 같은 숫자가 있는지 없는지 확인하는 함수
     * @author JHKwak
     * @since 2020. 9. 8
     * @param arr 같은 숫자가 있는지 없는지 확인하는 정수 배열
     * @return
     */
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        arrayList.add(arr[0]);
        
        for (int number: arr) {
            if (number != arrayList.get(arrayList.size() - 1)) {
                arrayList.add(number);    
            }
        }
        
        int[] intArray = new int[arrayList.size()];
        
        for (int i = 0; i < arrayList.size(); i++) {
            intArray[i] = arrayList.get(i);
        }
        
        return intArray;
    }
}
