package test.algorithm.programmers.solution.level1;

/**
 * 프로그래머스 : 핸드폰 번호 가리기
 * @author kwakjuheon
 * @since Sep 23, 2020
 *
 */
public class MaskingPhoneNum {
    
    /**
     * 핸드폰번호 가리기 프로그램을 실행하는 함수
     * @author kwakjuheon
     * @since Sep 23, 2020
     */
    public void run() {
        System.out.println(solution("01033334444"));
        System.out.println(solution("027778888"));
    }
    
    /**
     * 핸드폰 번호를 가리는 함수
     * @author kwakjuheon
     * @since Sep 23, 2020
     * @param phoneNumber 가려질 휴대폰 번호
     * @return 마지막 4자리만을 빼고 다 가려진 휴대폰 번호
     */
    public String solution(String phoneNumber) {
        
        int maskLen = phoneNumber.length() - 4;
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < maskLen; i++) {
            sb.append("*");
        }
        sb.append(phoneNumber.substring(maskLen));
        
        return sb.toString();
    }
}
