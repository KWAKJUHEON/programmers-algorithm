package test.algorithm.programmers.solution.level1;

/**
 * 문자열에서 P(p)의 개수와 Y(y)의 개수를 비교하는 클래스
 * @author JHKwak
 *
 */
public class CountPY {
   
    /**
     * 문자열에서 P(p)의 개수와 Y(y)의 개수를 비교하는 프로그램을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 10
     */
    public void run() {
        System.out.println(solution("pPoooyY"));
        System.out.println(solution("Pyy"));
        System.out.println(solution("qwer"));
    }
    
    /**
     * 문자열에서 P(p)의 개수와 Y(y)의 개수를 비교하는 함수
     * @author JHKwak
     * @since 2020. 9. 10
     * @param s 주어진 문자열
     * @return 문자열에서 P(p)의 개수와  Y(y)의 개수가 같다면 true, 같지 않다면 false
     */
    public boolean solution(String s) {
        
        s = s.toLowerCase();
        System.out.println(s);
        
        int pCount = 0;
        int yCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
            case 'p':
                pCount++;
                break;
            case 'y':
                yCount++;
                break;
            }
        }
        
        return pCount == yCount;
    }
}
