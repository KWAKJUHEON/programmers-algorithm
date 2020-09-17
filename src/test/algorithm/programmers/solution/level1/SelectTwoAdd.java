package test.algorithm.programmers.solution.level1;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 주어진 배열의 두 수의 가능한 모든 총합을 구하는 클래스 
 * @author JHKwak
 *
 */
public class SelectTwoAdd {
    
    /**
     * 주어진 배열의 두 수의 가능한 모든 총합을 구하는 프로그램을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 16
     */
    public void run() {
        for (int item: solution(new int[] {2,1,3,4,1})) {
            System.out.print(item + " ");
        }
        System.out.println();
        
        for (int item: solution(new int[] {1,1,1,1,1})) {
            System.out.print(item + " ");
        }
        System.out.println();
        
        for (int item: solution(new int[] {1,2,3,4,5})) {
            System.out.print(item + " ");
        }
        System.out.println();
        
        for (int item: solution(new int[] {5,0,2,7})) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    
    
    /**
     * 주어진 배열의 두 수의 가능한 모든 총합을 구하는 함수
     * @author JHKwak
     * @since 2020. 9. 16
     * @param numbers 두 수를 선택하여 가능한 모든 총합을 구할 배열
     * @return 주어진 배열에서 두 수를 선택하여 구한 가능한 모든 총합들의 배열
     */
    public int[] solution(int[] numbers) {
        
        SortedSet<Integer> resultSet = new TreeSet<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++)
            {
                resultSet.add(numbers[i] + numbers[j]);
            }
        }
        
        
        return resultSet.parallelStream().mapToInt(i->i).toArray();
    }

}
