package test.algorithm.programmers.solution.level1;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 프로그래머스 : 정수 내림차순으로 배치하기 
 * @author kwakjuheon
 * @since Sep 23, 2020
 *
 */
public class DecreasingOrderInt {
    
    /**
     * 정수 내림차순으로 배치하기 프로그램을 실행하는 함수
     * @author kwakjuheon
     * @since Sep 23, 2020
     */
    public void run() {
        System.out.println(solution(118372));
    }
    
    public long solution(long n) {
        
        // 받은 정수를 정수배열 형식으로 변환
        long[] longArray = Stream.of(String.valueOf(n).split(""))
                .mapToLong(Integer::parseInt)
                .toArray(); 
        
        // 정수배열 정렬
        Arrays.sort(longArray);
        
        StringBuilder sb = new StringBuilder();
        
        for (long l : longArray) {
            sb.append(l);
        }
        
        // 정수배열 역순으로 정렬 
        sb.reverse();
        
        return Long.valueOf(sb.toString());
        
    }
}
