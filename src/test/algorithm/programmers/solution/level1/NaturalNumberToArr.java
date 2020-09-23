package test.algorithm.programmers.solution.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 프로그래머스 : 자연수 뒤집어 배열로 만들기 
 * @author kwakjuheon
 * @since Sep 23, 2020
 *
 */
public class NaturalNumberToArr {

    /**
     * 자연수를 뒤집어 배열로 만드는 프로그램을 실행하는 함수 
     * @author kwakjuheon
     * @since Sep 23, 2020
     */
    public void run() {
        for (int item : solution(1234)) {
            System.out.println(item);
        }
    }

    /**
     * 자연수를 뒤집어 배열로 만드는 함수 
     * @author kwakjuheon
     * @since Sep 23, 2020
     * @param n 입력받은 자연수 
     * @return 자연수를 뒤집어서 만들어진 배열 
     */
    public int[] solution(long n) {

        String s = String.valueOf(n);
        List<Integer> nList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            nList.add(s.charAt(i) - '0');
        }
        
        Collections.reverse(nList);
        return nList.stream().mapToInt(i -> i).toArray();
    }
}
