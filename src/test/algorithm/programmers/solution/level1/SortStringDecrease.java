package test.algorithm.programmers.solution.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 문자열을 내림차순으로 정렬하는 클래스
 * @author JHKwak
 *
 */
public class SortStringDecrease {

    /**
     * 문자열을 내림차순으로 정렬하는 프로그램을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 10
     */
    public void run() {
        System.out.println(solution("Zbcdefg"));
        System.out.println(solution("AZaz"));

        System.out.println("----------------------------------------");

        System.out.println(solution1("Zbcdefg"));
        System.out.println(solution1("AZaz"));

    }

    /**
     * 문자열을 내림차순으로 정렬하는 함수
     * @author JHKwak
     * @since 2020. 9. 10
     * @param s 주어진 문자열
     * @return 내림차순으로 정렬된 문자열. 대문자는 소문자 뒤에 정렬한다.
     */
    public String solution(String s) {

        String answer = "";

        ArrayList<Character> smallCharAL = new ArrayList<>();
        ArrayList<Character> largeCharAL = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp >= 'A' && temp <= 'Z') {
                largeCharAL.add(temp);
            } else if (temp >= 'a' && temp <= 'z') {
                smallCharAL.add(temp);
            }
        }

        Collections.sort(largeCharAL);
        Collections.sort(smallCharAL);

        Collections.reverse(largeCharAL);
        Collections.reverse(smallCharAL);

        for (char smallChar : smallCharAL) {
            answer += smallChar;
        }

        for (char largeChar : largeCharAL) {
            answer += largeChar;
        }
        
        return answer;
    }

    /**
     * 문자열을 내림차순으로 정렬하는 함수
     * @author JHKwak
     * @since 2020. 9. 10
     * @param s 주어진 문자열
     * @return 내림차순으로 정렬된 문자열. 대문자는 소문자 뒤에 정렬한다.
     */
    public String solution1(String s) {

        try {
            char[] tempArray = s.toCharArray();
            
            Arrays.sort(tempArray);
            
            StringBuffer sb = new StringBuffer(new String(tempArray));
            
            return (sb != null) ? sb.reverse().toString() : null;
            
        } catch (Exception e) {
            return null;
        }
    }

}
