package test.algorithm.programmers.solution.level1;

/**
 * 프로그래머스 : 짝수와 홀수
 * @author kwakjuheon
 * @since Sep 23, 2020
 *
 */
public class EvenOdd {
    
    /**
     * 짝수와 홀수를 판별하는 프로그램을 시작하는 함수
     * @author kwakjuheon
     * @since Sep 23, 2020
     */
    public void run() {
        System.out.println(solution(3));
        System.out.println(solution(4));
    }
    
    /**
     * 짝수와 홀수를 판별하는 함수 
     * @author kwakjuheon
     * @since Sep 23, 2020
     * @param num 홀짝인지 판별할 정수
     * @return 홀수라면 "Odd", 짝수라면 "Even"
     */
    public String solution(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }
}
