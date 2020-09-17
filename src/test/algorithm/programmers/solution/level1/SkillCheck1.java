package test.algorithm.programmers.solution.level1;

/**
 * Programmers skill check Level 1
 * 입력받은 숫자를 자릿수 값끼리 더하는 클래스
 * (123 -> 1 + 2 + 3)
 * @author JHKwak
 *
 */
public class SkillCheck1 {
    
    /**
     * 입력받은 숫자를 자릿수 값끼리 더하는 프로그램을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 15
     */
    public void run() {
        System.out.println(solution(123));
        System.out.println(solution(987));
    }
    
    /**
     * 입력받은 숫자를 자릿수 값끼리 더하는 함수
     * @author JHKwak
     * @since 2020. 9. 15
     * @param n 입력받은 숫자
     * @return 입력받은 숫자의 자릿수 값끼리 더한 총합
     */
    public int solution(int n) {
        int answer = 0;
        
        String str = String.valueOf(n);
        
        for (int i = 0; i < str.length(); i++) {
            answer += str.charAt(i) - '0';
        }

        return answer;
    }
}
