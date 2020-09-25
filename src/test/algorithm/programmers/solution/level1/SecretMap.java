package test.algorithm.programmers.solution.level1;

/**
 * 프로그래머스 : 비밀지도
 * @author kwakjuheon
 * @since Sep 24, 2020
 *
 */
public class SecretMap {
    
    /**
     * 비밀지도 문제 풀이를 시작하는 함수
     * @author kwakjuheon
     * @since Sep 24, 2020
     */
    public void run() {

        for (String s: solution(5, new int[] {9, 20, 28, 18, 11}, new int[] {30, 1, 21, 17, 28})){
            System.out.println(s);
        }
        System.out.println("------------------------------------");
        
        for (String s: solution(6, new int[] {46, 33, 33 ,22, 31, 50}, new int[] {27 ,56, 19, 14, 14, 10})){
            System.out.println(s);
        }
        
    }
    
    /**
     * 입력받은 형식에 맞게 비밀지도의 형태를 그려주는 함수
     * @author kwakjuheon
     * @since Sep 24, 2020
     * @param n 입력받은 정사각형 지도의 한 변의 크기
     * @param arr1 첫번째 지도의 정보가 있는 배열
     * @param arr2 두번째 지도 정보가 있는 배열
     * @return 첫번째 지도와 두번째 지도의 정보를 통해 얻어진 최종 보물지도
     */
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        StringBuilder binarySB = new StringBuilder();
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            binarySB.append(Integer.toBinaryString(arr1[i] | arr2[i]));
            while (binarySB.length() < n) {
                binarySB.insert(0, "0");
            }
            
            answer[i] = "";
            for (int j = 0; j < binarySB.length(); j++) {
               answer[i] += (binarySB.charAt(j) == '0') ? " " : "#";
            }
            binarySB.setLength(0);
        }
        return answer;
    }

}
