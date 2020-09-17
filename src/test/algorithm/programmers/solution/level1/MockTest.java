package test.algorithm.programmers.solution.level1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 완전탐색을 이용하여 제일 높은 점수를 가진 사람을 찾는 클래스
 * @author JHKwak
 *
 */
public class MockTest {
   
    /**
     * 완전탐색을 이용하여 제일 높은 점수를 가진 사람을 찾는 프로그램을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 16
     */
    public void run() {
        for (int item : solution(new int[] { 1, 2, 3, 4, 5 })) {
            System.out.print(item + " ");
        }
        System.out.println();

        for (int item : solution(new int[] { 5, 5, 5, 5 })) {
            System.out.print(item + " ");
        }
        System.out.println();

        for (int item : solution(new int[] { 1, 3, 3, 4, 5 })) {
            System.out.print(item + " ");
        }
        System.out.println();
        
        for (int item : solution(new int[] { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 })) {
            System.out.print(item + " ");
        }
        System.out.println();

        for (int item : solution(new int[] { 1, 3, 2, 4, 2 })) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    /**
     * 완전탐색을 이용하여 제일 높은 점수를 가진 사람을 찾는 함수
     * @author JHKwak
     * @since 2020. 9. 16
     * @param answers 주어진 답의 배열
     * @return 많은 문항을 맞은 고득점자의 배열
     */
    public int[] solution(int[] answers) {

        ArrayList<Integer> oneAL = new ArrayList<>();
        ArrayList<Integer> twoAL = new ArrayList<>();
        ArrayList<Integer> threeAL = new ArrayList<>();

        int[] oneArray = { 1, 2, 3, 4, 5 };
        int[] twoArray = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] threeArray = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        ArrayList<Integer> resultArray = new ArrayList<>();
        
        for (int i = 0; i < answers.length; i++) {
            oneAL.add(oneArray[i % oneArray.length]);
            twoAL.add(twoArray[i % twoArray.length]);
            threeAL.add(threeArray[i % threeArray.length]);
        }
        
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (oneAL.get(i) == answers[i]) {
                result1++;
            }
            if (twoAL.get(i) == answers[i]) {
                result2++;
            }
            if (threeAL.get(i) == answers[i]) {
                result3++;
            }
        }
        
        
        resultArray.add(result1);
        resultArray.add(result2);
        resultArray.add(result3);
        
        int maxValue = Collections.max(resultArray);
        int valCount = 0;
        ArrayList<Integer> resultAL = new ArrayList<>();
        
        for (int item: resultArray) {
            System.out.println("item : " + item);
            if (item == maxValue) {
                resultAL.add(valCount);
            }
            valCount++;
        }
        
        Collections.sort(resultAL);
        
        return resultAL.stream().mapToInt(i->i + 1).toArray();
    }
}
