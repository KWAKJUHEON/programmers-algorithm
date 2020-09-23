package test.algorithm.programmers.solution.level1;

/**
 * 프로그래머스 : 정수 제곱근 판별
 * @author kwakjuheon
 * @since Sep 23, 2020
 *
 */
public class IntegerSquareRoot {
    
    /**
     * 정수 제곱근 판별 프로그램을 실행하는 함수 
     * @author kwakjuheon
     * @since Sep 23, 2020
     */
    public void run() {
        System.out.println(solution(121));
        System.out.println(solution(3));
    }
    
    /**
     * 정수가 양의 정수 제곱근을 가지고 있는지 아닌지 판별하는 함수
     * @author kwakjuheon
     * @since Sep 23, 2020
     * @param n 판별할 양의  정수
     * @return 정수가 양의 정수 제곱근을 가지고 있다면 양의 정수 제곱근, 아니라면 -1 
     */
    public long solution(long n) {
        
        double sqrtValue = Math.sqrt(n);
        
        return (String.valueOf(sqrtValue++).endsWith(".0")) ? (long) (sqrtValue * sqrtValue) : -1;
    }
}
