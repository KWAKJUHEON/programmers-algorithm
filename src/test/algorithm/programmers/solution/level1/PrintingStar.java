package test.algorithm.programmers.solution.level1;

/**
 * 프로그래머스 : 직사각형 별찍기
 * @author kwakjuheon
 * @since Sep 23, 2020
 *
 */
public class PrintingStar {
    
    /**
     * 직사각형 별찍기 프로그램을 실행하는 함수
     * @author kwakjuheon
     * @since Sep 23, 2020
     */
    public void run() {
        solution(5,3);
    }
    
    /**
     * 직사각형으로 별을 출력하는 함수
     * @author kwakjuheon
     * @since Sep 23, 2020
     * @param a 직사각형의 가로
     * @param b 직사각형의 세로
     */
    public void solution(int a, int b) {
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
