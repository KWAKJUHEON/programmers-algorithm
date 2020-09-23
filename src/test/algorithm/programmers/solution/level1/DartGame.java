package test.algorithm.programmers.solution.level1;

/**
 * 프로그래머스 : 다트 게임
 * @author kwakjuheon
 * @since Sep 23, 2020
 *
 */
public class DartGame {
    
    /**
     * 다트 게임을 실행하는 함수 
     * @author kwakjuheon
     * @since Sep 23, 2020
     */
    public void run() {
        System.out.println(solution("1S2D*3T"));
        System.out.println();
        System.out.println(solution("1D2S#10S"));
        System.out.println();
        System.out.println(solution("1D2S0T"));
        System.out.println();
        System.out.println(solution("1S*2T*3S"));
        System.out.println();
        System.out.println(solution("1D#2S*3S"));
        System.out.println();
        System.out.println(solution("1T2D3D#"));
        System.out.println();
        System.out.println(solution("1D2S3T*"));
        
    }
    
    /**
     * 주어진 형식에 맞게 다트게임의 점수를 계산하는 함수
     * @author kwakjuheon
     * @since Sep 23, 2020
     * @param dartResult 점수 계산 형식이 있는 문자열
     * @return 형식에 맞게 합산된 다트게임의 결과값
     */
    public int solution(String dartResult) {
        String[] number = dartResult.split("[A-Z][*|#]*");
        String[] alpha = dartResult.split("[0-9]0*");
        
        int answer = 0;
        
        int[] result = new int[3];
       
        for (int i = 0; i < 3; i++) {
            if (alpha[i+1].startsWith("S")) {
                result[i] = Integer.valueOf(number[i]);                
            } else if (alpha[i+1].startsWith("D")) {                
                result[i] = (int) Math.pow(Integer.valueOf(number[i]), 2);
            } else {                
                result[i] = (int) Math.pow(Integer.valueOf(number[i]), 3);
            }
            
            if (alpha[i+1].endsWith("#")) {
                result[i] *= (-1);
            }
            
            else if (alpha[i+1].endsWith("*")) {
                if (i == 0) {
                    result[i] *= 2;
                } else {       
                    result[i -1] *= 2;
                    result[i] *=  2; 
                }
            }
        }
        
        for (int value: result) {
            answer += value;
        }
        return answer;
    }
}
