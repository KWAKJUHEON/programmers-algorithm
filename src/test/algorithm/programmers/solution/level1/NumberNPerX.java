package test.algorithm.programmers.solution.level1;

/**
 * x만큼 n번 커지는 숫자들의 배열을 구하는 클래스
 * @author JHKwak
 *
 */
public class NumberNPerX {

    /**
     * x만큼 n번 커지는 숫자들의 배열을 구하는 프로그램을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 15
     */
    public void run() {
        for (long item : solution(2, 5)) {
            System.out.print(item + " ");
        }
        System.out.println();
        for (long item : solution(4, 3)) {
            System.out.print(item + " ");
        }
        System.out.println();
        for (long item : solution(-4, 2)) {
            System.out.print(item + " ");
        }
        System.out.println();
        for (long item : solution(-4, 1)) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    /**
     * x만큼 n번 커지는 숫자들의 배열을 구하는 함수
     * @author JHKwak
     * @since 2020. 9. 15
     * @param x 시작하는 값이면서 계속 더하는 수 
     * @param n 더하기를 반복할 횟수
     * @return x부터 시작해서 x씩 n번 더해진 수들의 배열 
     */
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        long temp = x;
        for (int i = 0; i < n; i++) {
            answer[i] = Long.valueOf(temp);
            temp += x;
        }
        
        return answer;
    }
}
