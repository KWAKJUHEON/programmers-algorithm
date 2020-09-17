package test.algorithm.programmers.solution.level1;

/**
 * 시저 암호를 적용하는 클래스
 * @author JHKwak
 *
 */
public class CaesarCipher {

    /**
     * 시저암호를 적용하는 프로그램을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 8
     */
    public void run() {
        for (int i = 1; i < 27; i++) {
            System.out.println(solution("a b c d e f g h i j k l m n o p q r s t u v w x y z", i));
            System.out.println(solution("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z", i));
        }
    }

    /**
     * 주어진 string에 맞도록 시저암호를 적용하는 함수
     * @author JHKwak
     * @since 2020. 9. 8
     * @param s 시저암호를 적용할 문자열
     * @param n 시저암호를 적용할 단계
     * @return 주어진 n 단계의 시저암호를 적용한 string
     */
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char charS = s.charAt(i);

            if ((charS >= 'A' && charS < 'Z')) {
                if ((charS + n >= 122) || (charS + n >= 91) && (charS + n <= 115)) {
                    sb.append((char) (charS + n - 26));
                } else {
                    sb.append((char) (charS + n));
                }
            } else if (charS >= 'a' && charS < 'z') {
                if ((charS + n >= 91) && (charS + n <= 97) || (charS + n > 122) && (charS + n <= 147)) {
                    sb.append((char) (charS + n - 26));
                } else {
                    sb.append((char) (charS + n));
                }
            } else if (charS == 32) {
                sb.append((char) charS);
            } else if (charS == 'Z' || charS == 'z') {
                sb.append((char) (charS - 26 + n));
            }

        }
        return sb.toString();
    }
}
