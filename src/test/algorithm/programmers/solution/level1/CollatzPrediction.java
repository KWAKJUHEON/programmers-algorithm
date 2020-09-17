package test.algorithm.programmers.solution.level1;

/**
 * 주어진 수가 콜라츠 추측에 도달할 때까지 반복한 작업 수를 구하는 클래스
 * @author JHKwak
 *
 */
public class CollatzPrediction {
    
    /**
     * 주어진 수가 콜라츠 추측에 도달할 때까지 반복한 작업 수를 구하는 프로그램을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 11
     */
    public void run() {
        System.out.println(solution(6));
        System.out.println(solution(16));
        System.out.println(solution(626331));
    }
    
    /**
     * 주어진 수가 콜라츠 추측에 도달할 때까지 반복한 작업 수를 구하는 함수
     * @author JHKwak
     * @since 2020. 9. 11
     * @param num 콜라츠 추측에 해당하는지 판별할 수
     * @return 반복한 작업 수 (작업수가 500을 넘는다면 -1)
     */
    public int solution(long num) {
        
        int result = 0;
        
        while (num != 1) {
            num = (num % 2 == 0) ? num / 2 : num * 3 + 1;
            result++;
            if (result == 499) {
                return -1;
            }
        }
        
        return result;
    }
}
