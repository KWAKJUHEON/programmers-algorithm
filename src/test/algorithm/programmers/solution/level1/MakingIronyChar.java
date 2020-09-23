package test.algorithm.programmers.solution.level1;

/**
 * 프로그래머스 : 이상한 문자 만들기 
 * @author kwakjuheon
 * @since Sep 23, 2020
 *
 */
public class MakingIronyChar {
    
    /**
     * 이상한 문자 만들기 프로그램을 실행하는 함수 
     * @author kwakjuheon
     * @since Sep 23, 2020
     */
    public void run() {
        System.out.println(solution(" try hello world"));
        System.out.println(solution(" "));
    }
    
    /**
     * 이상한 문자를 만드는 함수 
     * @author kwakjuheon
     * @since Sep 23, 2020
     * @param s 입력받은 문자열 
     * @return 입력받은 문자열을 가지고 만들어진 이상한 문자열 
     */
    public String solution(String s) {
        String answer = "";
        
        String upper = s.toUpperCase();
        String lower = s.toLowerCase();
        
        int order = 0;
        for (int i = 0; i < s.length(); i++) {
            // 공백인 경우 그대로 공백 입력 및 단어 재확인 
            if (s.charAt(i) == ' ') {
                answer += ' ';
                order = 0;
                continue;
            }
            
            // order가 0으로 바뀌었을 때 - 다음 단어를 만났을 때     
            // 짝수번째 위치라면 대문자 입력, 홀수번째 위치라면 소문자 입력    
            answer += (order % 2 == 0) ? upper.charAt(i) : lower.charAt(i);
            order++;
        }
        return answer;
    }
}
