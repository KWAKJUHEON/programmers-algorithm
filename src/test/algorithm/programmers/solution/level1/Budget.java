package test.algorithm.programmers.solution.level1;

import java.util.Arrays;

/**
 * 카카오 예산 
 * @author kwakjuheon
 * @since Sep 22, 2020
 *
 */
public class Budget {
    
    /**
     * 예산을 분배할 수 있는 최대 부서 개수를 구하는 프로그램을 실행하는 함
     * @author kwakjuheon
     * @since Sep 23, 2020
     */
    public void run() {
        System.out.println(solution(new int[] {1, 3, 2, 5, 4}, 9));
        System.out.println(solution(new int[] {2, 2, 3, 3}, 10));
    }
    
    /**
     * 예산을 분배할 수 있는 최대 부서 개수를 구하는 프로그램을 실행하는 함
     * @author kwakjuheon
     * @since Sep 22, 2020
     * @param d 부서별로 신청한 금액 배열 
     * @param budget 예산 
     * @return 지원해줄 수 있는 최대 부서 개수  
     */
    public long solution(int[] d, int budget) {
        
        Arrays.sort(d);
        int totalPrice = 0;
        int answer = 0;
        
        for (int price: d) {
            totalPrice += price;
            
            if (totalPrice <= budget) {
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }   
}
