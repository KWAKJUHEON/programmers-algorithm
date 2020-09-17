package test.algorithm.programmers.solution.level1;

import java.util.Arrays;

/**
 * 배열의 일부분을 정리하여 k번째 있는 수를 확인하는 클래스
 * @author JHKwak
 *
 */
public class KthNum {

    /**
     * 배열의 일부분을 정리하여 k번째 있는 수를 확인하는 프로그램을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 11
     */
    public void run() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        
        for (int item:solution(array, commands)) {
            System.out.print(item + " ");
        }
    }
    
    /**
     * 주어진 시작 index와 끝 index 사이의 일부분의 배열을 정렬하여 k번째 있는 수를 확인하는 함수
     * @author JHKwak
     * @since 2020. 9. 11
     * @param array 정렬할 배열
     * @param commands 정렬할 배열의 시작 index, 끝 index, 정렬된 배열에서 몇 번째 값을 가져올 것인지에 대한 k가 배열로 주어짐.
     * @return 정렬된 배열의 k번째 수의 배열
     */
    public int[] solution(int[] array, int[][] commands) {
        
        int[] result = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int[] tempArray = new int[(commands[i][1] - commands[i][0] + 1)];
            System.arraycopy(array, commands[i][0] - 1, tempArray, 0, tempArray.length);
            Arrays.sort(tempArray);
            
            result[i] = tempArray[commands[i][2] - 1];
        }
        return result;
    }
}
