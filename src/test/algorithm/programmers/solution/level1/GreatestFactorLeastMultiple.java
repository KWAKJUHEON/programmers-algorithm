package test.algorithm.programmers.solution.level1;

/**
 * 두 수의 최대공약수, 최소공배수를 구하는 클래스
 * @author JHKwak
 *
 */
public class GreatestFactorLeastMultiple {

    /**
     * 두 수의 최대공약수, 최소공배수를 구하는 프로그램을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 11
     */
    public void run() {
        for (int result : solution(3, 12)) {
            System.out.println(result);
        }
        System.out.println("-------------------------------");
        for (int result : solution(2, 5)) {
            System.out.println(result);
        }
        System.out.println("-------------------------------");
        for (int result : solution(12, 48)) {
            System.out.println(result);
        }

    }

    /**
     * 두 수의 최대공약수, 최소공배수를 구하는 함수
     * @author JHKwak
     * @since 2020. 9. 11
     * @param n 첫 번째 수
     * @param m 두 번째 수
     * @return 구한 최대공약수, 최소공배수로 이루어진 배열
     */
    public int[] solution(int n, int m) {

        int[] resultArray = new int[2];
        int mul = n * m;
        
        // 최대공약수
        int temp = m % n;
        
        while (temp > 0) {
            m = n;
            n = temp;
            temp = m % n;
        }
        resultArray[0] = n;

        // 최소공배수
        resultArray[1] = mul / n;
        
        return resultArray;
    }

}
