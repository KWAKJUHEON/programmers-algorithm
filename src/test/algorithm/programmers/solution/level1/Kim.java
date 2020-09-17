package test.algorithm.programmers.solution.level1;

/**
 * 주어진 배열에서 Kim이라는 단어를 찾아 index를 반환하는 클래스
 * @author JHKwak
 *
 */
public class Kim {
    
    /**
     * 주어진 배열에서 단어 Kim의 index를 반환하는 프로그램을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 8
     */
    public void run() {
        String[] strArray = {"Jane", "Kim"};
        System.out.println(solution(strArray));
    }

    /**
     * 주어진 배열에서 단어 Kim을 찾아 index를 반환하는 함수
     * @author JHKwak
     * @since 2020. 9. 8
     * @param seoul Kim이라는 단어를 찾을 String 배열
     * @return 배열에서 찾은 Kim 단어의 index 
     */
    public String solution(String[] seoul) {
        StringBuffer sb = new StringBuffer();
        sb.append("김서방은 ");
        int index = 0;
        for (String item: seoul) {
            if (item.equals("Kim")) {
                sb.append(index);
            }
            index++;
        }
        sb.append("에 있다");
        return sb.toString();
    }
}
