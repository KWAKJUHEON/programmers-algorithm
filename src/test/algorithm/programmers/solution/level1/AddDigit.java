package test.algorithm.programmers.solution.level1;
/**
 * 프로그래머스 : 자릿수 더하기
 * @author kwakjuheon
 * @since Sep 22, 2020
 *
 */
public class AddDigit {

    /**
     * 자릿수 더하기 프로그램을 실행하는 함수
     * @author kwakjuheon
     * @since Sep 23, 2020
     */
    public void run() {
        System.out.println(solution(123));
        System.out.println(solution(987));
    }

    /**
     * 자릿수를 더하는 함수 
     * @author kwakjuheon
     * @since Sep 22, 2020
     * @param n 주어진 숫자 
     * @return 자릿수끼리 더해진 총합 
     */
    public int solution(int n) {
        int answer = 0;
        String a = String.valueOf(n);
        
        for (int i = 0; i < a.length(); i++) {
            answer += a.charAt(i) - '0';
        }
        
        return answer;
    }

}
