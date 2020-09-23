package test.algorithm.programmers.solution.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 프로그래머스 : 제일 작은 수 제거하기
 */
public class MinValueRemover {

    /**
     * 제일 작은 수 제거하기 프로그램을 실행하는 함수
     * @author kwakjuheon
     * @since Sep 23, 2020
     */
    public void run() {
        for (int i : solution(new int[] { 4, 3, 2, 1, 1, -1, -1 })) {
            System.out.println(i);
        }

        for (int i : solution(new int[] {-21, -4})) {
            System.out.println(i);
        }
    }

    /**
     * 배열에서 제일 작은 수를 제거하는 함수
     * @author kwakjuheon
     * @since Sep 23, 2020
     * @param arr 정수 배열
     * @return 가장 작은 수가 제거된 배열
     */
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) {
            return new int[] {-1};
        }

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        int minValue = Collections.min(list);

        return list.stream().filter(i -> i != minValue).mapToInt(i -> i).toArray();

    }
}
