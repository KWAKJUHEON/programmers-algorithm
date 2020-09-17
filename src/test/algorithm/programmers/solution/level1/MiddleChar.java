package test.algorithm.programmers.solution.level1;

/**
 * String의 중간 글자를 구하는 클래스
 * @author JHKwak
 *
 */
public class MiddleChar {
    /**
     * string의 중간 글자를 구하는 프로그램을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 10
     */
    public void run() {
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));
    }

    /**
     * string의 중간글자를 구하는 함수
     * @author JHKwak
     * @since 2020. 9. 10
     * @param s 중간글자를 구할 원래의 string
     * @return 주어진 string의 중간글자
     */
    public String solution(String s) {
        
        int strLen = s.length() / 2;
        return (s.length() % 2 != 0) ? s.substring(strLen, strLen + 1) : s.substring(strLen - 1, strLen + 1);
    }
}
