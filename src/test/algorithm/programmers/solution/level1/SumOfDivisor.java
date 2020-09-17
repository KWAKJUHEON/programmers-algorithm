package test.algorithm.programmers.solution.level1;

/**
 * 약수의 합을 구하는 클래스
 * @author JHKwak
 *
 */
public class SumOfDivisor {

    /**
     * 약수의 합을 구하는 프로그램을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 9
     */
    public void run() {
        System.out.println(solution(12));
        System.out.println(solution(5));
    }
    
    /**
     * 주어진 수의 약수의 합을 구하는 함수
     * @author JHKwak
     * @since 2020. 9. 9
     * @param n 입력받은 수
     * @return 입력받은 수의 약수의 총합
     */
    public int solution(int n) {
        
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        
        return answer;
    }
}
