package test.algorithm.programmers.solution.level1;

/**
 * Programmers Skill Check Level 2
 * 
 * 두 행렬의 합을 구하는 클래스
 * @author JHKwak
 *
 */
public class SkillCheck2 {

    /**
     * 두 행렬의 합을 구하는 프로그램을 시작하는 함수
     * @author JHKwak
     * @since 2020. 9. 15
     */
    public void run() {
        int[][] answer1 = solution(new int[][] {{1, 2}, {2, 3}}, new int[][] {{3, 4}, {5, 6}});
        for (int i = 0; i < answer1.length; i++) {
            for (int j = 0; j < answer1[i].length; j++) {
                System.out.print(answer1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        
        int[][] answer2 = solution(new int[][] {{1}, {2}}, new int[][] {{3}, {4}});
        for (int i = 0; i < answer2.length; i++) {
            for (int j = 0; j < answer2[i].length; j++) {
                System.out.print(answer2[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    /**
     * 두 행렬의 합을 구하는 함수
     * @author JHKwak
     * @since 2020. 9. 15
     * @param arr1 더할 첫 번째 행렬
     * @param arr2 더할 두 번째 행렬
     * @return 주어진 두 행렬을 더한 합
     */
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
