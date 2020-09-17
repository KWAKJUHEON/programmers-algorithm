package test.algorithm.programmers.solution.level1;

import java.util.ArrayList;

/**
 * (카카오) 인형뽑기 게임
 * @author JHKwak
 *
 */
public class CrainDoll {
    
    /**
     * 인형뽑기 게임을 하는 프로그램을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 14
     */
    public void run() {
        int[][] array = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 }, { 3, 5, 1, 3, 1 } };
        int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
        System.out.println(solution(array, moves));
    }

    /**
     * 인형뽑기 게임을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 14
     * @param board 인형뽑기 게임의 화면 구성
     * @param moves 인형을 잡기 위해 크레인을 작동시킨 위치
     * @return 인형뽑기 게임이 진행된 후 게임을 통해 터트려져 사라진 인형의 개수
     */
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        ArrayList<Integer> intAL = new ArrayList<>();
        intAL.add(0);

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    if (board[j][moves[i] - 1] == intAL.get(intAL.size() - 1)) {
                        answer += 2;
                        intAL.remove(intAL.size() - 1);
                    } else {
                        intAL.add(board[j][moves[i] - 1]);
                    }
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
