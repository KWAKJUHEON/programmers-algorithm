package test.algorithm.programmers.solution.level1;

/**
 * 수박이라는 단어를 반복하여 출력하는 클래스
 * @author JHKwak
 *
 */
public class Subak {
    
    /**
     * 단어 '수박'을 반복하여 출력하는 프로그램을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 8
     */
    public void run() {
        System.out.println(solution(4));
        System.out.println(solution(3));
        System.out.println(solution(2));
        System.out.println(solution(1));
    }
    
    /**
     * 단어 '수박'을 주어진 수만큼 반복한 String을 만드는 함수
     * @author JHKwak
     * @since 2020. 9. 8
     * @param n 단어 '수박'을 반복할 숫자
     * @return 입력된 숫자만큼 단어 '수박'을 반복한 string
     */
    public String solution(int n) {
        StringBuffer sb = new StringBuffer();
        
        for (int i = 0; i < (n + 1) / 2; i++) {
            sb.append("수박");    
        }
        sb.setLength(n);
        
        return sb.toString();
    }

}
