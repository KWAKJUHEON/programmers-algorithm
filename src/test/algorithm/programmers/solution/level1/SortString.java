package test.algorithm.programmers.solution.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 문자열을 마음대로 정렬하는 클래스
 * @author JHKwak
 *
 */
public class SortString {

    private String[] testArray1 = { "sun", "bed", "car" };
    private String[] testArray2 = { "abce", "abcd", "abcdd", "abcde", "cdx", "abep", "abea" };
    private String[] testArray4 = { "abzcd", "cdzab", "abzfg", "abzaa", "abzbb", "bbzaa", "aab", "aba" };

    /**
     * 문자열을 주어진 index별로 정렬하는 프로그램을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 9
     */
    public void run() {
        for (String item : solution2(testArray1, 1)) {
            System.out.print(item + "/");
        }
        System.out.println();
        for (String item : solution2(testArray2, 2)) {
            System.out.print(item + "/");
        }
        System.out.println();
        for (String item : solution2(testArray4, 2)) {
            System.out.print(item + "/");
        }
    }
    
    /**
     * 문자열을 주어진 index별로 정렬하는 함수
     * @author JHKwak
     * @since 2020. 9. 9
     * @param strings 정렬해야하는 String 배열
     * @param n 어느 글자를 기준으로 정렬할지 정해주는 String의 index
     * @return 주어진 index값을 기준으로, 사전식으로 정렬된 String 배열 
     */
    public String[] solution2(String[] strings, int n) {
        List<String> l = Arrays.asList(strings);
         Collections.sort(l, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                int c = o1.charAt(n) - o2.charAt(n);
                return c != 0 ? c : o1.compareTo(o2);
            }
        });
         
        return l.toArray(new String[0]);
    }

    /**
     * 문자열을 주어진 index별로 정렬하는 함수
     * @author JHKwak
     * @since 2020. 9. 9
     * @param strings 정렬해야하는 String 배열
     * @param n 어느 글자를 기준으로 정렬할지 정해주는 String의 index
     * @return 주어진 index값을 기준으로, index 값이 같다면 사전식으로 정렬된 String 배열 
     */
    public String[] solution(String[] strings, int n) {

        ArrayList<String> stringAL = new ArrayList<>();

        for (String item : strings) {
            if (item.length() != 1) {
                item = item.charAt(n) + item;
            }
            stringAL.add(item);
        }

        Collections.sort(stringAL);
        
        String[] result = new String[stringAL.size()];

        for (int i = 0; i < stringAL.size(); i++) {
            int strLen = stringAL.get(i).length();
            if (strLen != 1) {
                result[i] = stringAL.get(i).substring(1, strLen);
            } else {
                result[i] = stringAL.get(i);
            }
        }

        return result;
    }

}
