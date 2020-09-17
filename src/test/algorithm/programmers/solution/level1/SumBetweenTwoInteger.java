package test.algorithm.programmers.solution.level1;

/**
 * 주어진 두 수 사이의 합을 구하는 클래스
 * @author JHKwak
 *
 */
public class SumBetweenTwoInteger {
    
    /**
     * 주어진 두 수 사이의 합을 구하는 프로그램을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 10
     */
    public void run() {
        System.out.println(solution(3, 5));
        System.out.println(solution(3, 3));
        System.out.println(solution(5, 3));
    }

    /**
     * 주어진 두 수 사이의 합을 구하는 함수
     * @author JHKwak
     * @since 2020. 9. 10
     * @param a 주어진 첫번째 수
     * @param b 주어진 두번째 수
     * @return 주어진 a,b 사이에 있는 수들의 총합
     */
    public long solution(int a, int b) {

        long answer = 0;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++) {
            answer += i;
        }

        return answer;
    }
}
