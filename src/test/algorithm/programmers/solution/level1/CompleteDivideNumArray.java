package test.algorithm.programmers.solution.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 주어진 배열 중에서 주어진 수에 나누어 떨어지는 값만을 찾는 클래스
 * @author JHKwak
 *
 */
public class CompleteDivideNumArray {

    /**
     * 주어진 배열 중 주어진 수에 나누어 떨어지는 값만을 찾는 프로그램을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 10
     */
    public void run() {
        int[] testArray1 = { 5, 9, 7, 10 };
        for (int item : solution(testArray1, 5)) {
            System.out.print(item);
        }
        System.out.println();
        int[] testArray2 = { 2, 36, 1, 3 };
        for (int item : solution(testArray2, 1)) {
            System.out.print(item);
        }
        System.out.println();
        int[] testArray3 = { 3, 2, 6 };
        for (int item : solution(testArray3, 10)) {
            System.out.print(item);
        }
        System.out.println();
    }

    /**
     * 주어진 배열 중 주어진 수에 나누어 떨어지는 값만을 찾는 함수
     * @author JHKwak
     * @since 2020. 9. 10
     * @param arr 나누어 떨어지는 값을 찾을 배열
     * @param divisor 배열에 있는 값을 나누는 값
     * @return arr 배열에 있는 값을 divisor로 나눴을 때 나누어 떨어지는 값들의 배열
     */
    public int[] solution(int[] arr, int divisor) {

        List<Integer> resultAL = new ArrayList<>();

        Arrays.sort(arr);
        int[] result = { -1 };

        for (int item : arr) {
            if (item % divisor == 0) {
                resultAL.add(item);
            }
        }

        int alSize = resultAL.size();

        if (alSize != 0) {
            
            result = new int[alSize];

            for (int i = 0; i < alSize; i++) {
                result[i] = resultAL.get(i);
            }
        }

        return result;
    }
}
