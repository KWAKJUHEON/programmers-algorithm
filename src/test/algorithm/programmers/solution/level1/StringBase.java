package test.algorithm.programmers.solution.level1;

/**
 * 문자열이 숫자로만 구성되어 있는지 확인하는 클래스
 * 
 * @author JHKwak
 *
 */
public class StringBase {

    /**
     * 문자열의 숫자 구성을 테스트하는 프로그램을 실행하는 함수
     * 
     * @author JHKwak
     * @since 2020.09.08.
     */
    public void run() {
        System.out.println(solution("a1234"));
        System.out.println(solution("1234"));
        System.out.println(solution("123434"));
        System.out.println(solution("1234A55"));
        System.out.println(solution("0000"));

        System.out.println("------------------------");

        System.out.println(solution1("a1234"));
        System.out.println(solution1("1234"));
        System.out.println(solution1("123434"));
        System.out.println(solution1("1234A55"));
        System.out.println(solution1("0000"));
    }

    /**
     * 문자열이 숫자로만 구성되어 있는지 확인하는 함수
     * 
     * @author JHKwak
     * @since 2020.09.09
     * @param s 입력받은 문자열
     * @return 문자열의 길이가 4또는 6이면서 문자열이 숫자로만 구성되어 있다면 true, 문자열의 길이가 4나 6이 아니거나, 문자열에
     *         숫자가 아닌 다른 문자가 있다면 false
     */
    public boolean solution(String s) {

        // 문자열의 길이 확인 (문자열 길이는 4혹은 6이어야 함)
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        // 문자열이 숫자로 구성되어 있는지 확인 (숫자가 아닌 문자가 나온다면 false 반환)
        for (int i = 0; i < s.length(); i++) {
            int item = s.charAt(i);
            if (!(item > 47 && item < 58)) {
                return false;
            }
        }

        // 아무런 예외도 없는 경우 return true
        return true;
    }

    /**
     * 문자열이 숫자로만 구성되어 있는지 확인하는 함수
     * 
     * @author JHKwak
     * @since 2020.09.09
     * @param s 입력받은 문자열
     * @return 문자열의 길이가 4또는 6이면서 문자열이 숫자로만 구성되어 있다면 true, 문자열의 길이가 4나 6이 아니거나, 문자열에
     *         숫자가 아닌 다른 문자가 있다면 false
     */
    public boolean solution1(String s) {

        if (s.length() == 4 || s.length() == 6) {
            try {
                Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;

    }
}
