package test.algorithm.programmers.solution.level1;

/**
 * String을 int로 바꾸는 클래스
 * @author JHKwak
 *
 */
public class Str2Int {
    
    /**
     * String을 int로 바꾸는 프로그램을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 8
     */
    public void run() {
        System.out.println(solution("1234"));
        System.out.println(solution("-1234"));
    }

    /**
     * String을 int로 바꾸는 함수
     * @author JHKwak
     * @since 2020. 9. 8
     * @param s int로 변환할 String
     * @return int형으로 변환된 String
     */
    public int solution(String s) {
        int answer = 0;

        if (s.charAt(0) == '-') {
            answer = Integer.valueOf(s.substring(1, s.length()));
            answer -= answer * 2;
        } else {
            answer = Integer.valueOf(s.substring(0, s.length()));
        }
        
        return answer;
    }
}
