package test.algorithm.programmers.solution.level1;

/**
 * 주어진 수가 하샤드 수인지 판별하는 클래스
 * @author JHKwak
 *
 */
public class HarshadNumber {

    /**
     * 주어진 수가 하샤드 수인지 판별하는 프로그램을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 11
     */
    public void run(){
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));
    }
    
    /**
     * 하샤드 수 : 각 자릿 수의 합으로 나누어지는 수
     * 주어진 수가 하샤드 수인지 판별하는 함수
     * @author JHKwak
     * @since 2020. 9. 11
     * @param x 하샤드 수인지 판별할 수
     * @return 주어진 수가 하샤드 수라면 true, 아니라면 false
     */
    public boolean solution(int x) {
        String harshad = String.valueOf(x);
        
        int numerator = 0;
        for (int i = 0; i < harshad.length(); i++) {
            numerator += harshad.charAt(i) - '0';
        }
        return (x % numerator == 0);
    }
}
