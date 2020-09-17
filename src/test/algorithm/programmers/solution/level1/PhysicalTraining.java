package test.algorithm.programmers.solution.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Greedy 알고리즘을 이용하는 체육복 분배 문제
 * @author JHKwak
 *
 */
public class PhysicalTraining {
    
    /**
     * Greedy 알고리즘을 이용한 체육복 분배 문제를 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 15
     */
    public void run() {
        System.out.println(solution(5, new int[] {2, 4}, new int[] {1, 3, 5})); // 5
        System.out.println(solution(5, new int[] {2, 4}, new int[] {3})); // 4
        System.out.println(solution(3, new int[] {3}, new int[] {1})); // 2
        System.out.println(solution(18, new int[] {7, 8, 11, 12}, new int[] {1, 6, 8, 10})); // 17
        System.out.println(solution(24, new int[] {12, 13, 16, 17, 19, 20, 21, 22}, new int[] {1, 22, 16, 18, 9, 10})); // 19
        System.out.println(solution(8, new int[] {5, 6}, new int[] {4, 5})); // 7
        System.out.println(solution(5, new int[] {2, 3}, new int[] {3, 4})); // 4
        System.out.println(solution(100, new int[] {27, 90, 42}, new int[] {28, 91, 42})); // 100
        System.out.println(solution(5, new int[] {3}, new int[] {2, 3})); // 5
        System.out.println(solution(5, new int[] {3}, new int[] {3, 4})); // 5
        System.out.println(solution(7, new int[] {3, 5}, new int[] {4, 2})); // 7
        System.out.println(solution(8, new int[] {3, 4, 7, 8}, new int[] {1, 2, 3, 4, 5, 7, 8})); // 8
    }
    
    /**
     * Greedy알고리즘을 이용하여 채육복을 분배하는 함수
     * @author JHKwak
     * @since 2020. 9. 15
     * @param n 총 인원 수
     * @param lost 체육복을 잃어버린 사람들의 배열
     * @param reserve 여분의 체육복을 가지고 있는 사람들의 배열
     * @return 체육복을 최대한 많이 가진 인원 수
     */
    public int solution(int n, int[] lost, int[] reserve) {
        
        // Arrays.stream(array) : array로부터 반복자 stream을 얻음
        // boxed() : int -> Integer, double -> Double, float -> Float 등으로 바꿔줌
        // 앞에서 이루어진 boxed된 stream을 Collect에 있는 매개변수의 형식으로 return 해줌.
        List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());
        List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());
        
        Collections.sort(lostList);
        
        int answer = 0;

        // 여분의 체육복이 있으면서 체육복을 잃어버린 사람을 찾음
        // 자신이 입어야 하므로 아무에게도 빌려줄 수 없음
        for (int i = 0; i < reserveList.size(); i++) {
            Integer e = reserveList.get(i);
            
            if (lostList.contains(e)) {
                lostList.remove(new Integer(e));
                reserveList.remove(new Integer(e));
                i--;
                answer++;
            }
        }
        
        if (lostList.size() == 0) {
            return n;
        }
        
        n -= lost.length;
        
        Collections.sort(reserveList);
        
        for (int i = 0; i < reserveList.size(); i++) {
            
            Integer lostItem = reserveList.get(i);
            
            if (lostList.contains(lostItem - 1)) {
                lostList.remove(new Integer(lostItem - 1));
                reserveList.remove(new Integer(lostItem - 1));
                answer++;
            } else if (lostList.contains(lostItem + 1)) {
                lostList.remove(new Integer(lostItem + 1));
                reserveList.remove(new Integer(lostItem + 1));
                answer++;
            }
        }
        
        return n += answer;
    }

}
