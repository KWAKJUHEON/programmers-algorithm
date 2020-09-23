package test.algorithm.programmers.solution.level1;

import java.util.ArrayList;

/**
 * 키패드 거리 구하기 
 * @author kwakjuheon
 * @since Sep 22, 2020
 *
 */
public class KakaoKeypad {

    /**
     * 키패드 거리 구하기 프로그램을 실행하는 함수 
     * @author kwakjuheon
     * @since Sep 23, 2020
     */
    public void run() {
        System.out.println(solution(new int[] { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 }, "right"));
        System.out.println(solution(new int[] { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 }, "left"));
        System.out.println(solution(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }, "right"));
    }

    /**
     * 키패드 거리 구하기 함수 
     * @author kwakjuheon
     * @since Sep 22, 2020
     * @param numbers 순서대로 눌러야 할 번호 목록 
     * @param hand 주로 사용하는 손 
     * @return 키패드별로 사용한 손의 리스트  
     */
    public String solution(int[] numbers, String hand) {
        
        String answer = "";
        // 맨해튼 거리 구하기 |(x2 - x1) + (y2 - y1)|
        ArrayList<Point> pointAL = new ArrayList<>();
        
        pointAL.add(new Point(0, 3, 1));
        pointAL.add(new Point(1, 0, 0));
        pointAL.add(new Point(2, 0, 1));
        pointAL.add(new Point(3, 0, 2));
        pointAL.add(new Point(4, 1, 0));
        pointAL.add(new Point(5, 1, 1));
        pointAL.add(new Point(6, 1, 2));
        pointAL.add(new Point(7, 2, 0));
        pointAL.add(new Point(8, 2, 1));
        pointAL.add(new Point(9, 2, 2));
        pointAL.add(new Point(-1, 3, 0));
        pointAL.add(new Point(-2, 3, 2));
        
        Point currPoint = null;
        Point leftPoint = pointAL.get(10);
        Point rightPoint = pointAL.get(11);
        
        for (int number: numbers) {
            
            currPoint = pointAL.get(number);
            
            switch(number){
            case 1: case 4: case 7:
                leftPoint = pointAL.get(number);
                answer += "L";
                break;
            case 3: case 6: case 9:
                rightPoint = pointAL.get(number);
                answer += "R";
                break;
            default:
                // 왼손에서의 거리 
                int leftD = Math.abs(currPoint.x - leftPoint.x) + Math.abs(currPoint.y - leftPoint.y);
                // 오른손에서의 거리 
                int rightD = Math.abs(currPoint.x - rightPoint.x) + Math.abs(currPoint.y - rightPoint.y);
                
                // 양손의 거리가 같을 때 
                if (leftD == rightD) {
                    // 어느 손을 주로 사용하는지 보고, 해당 손 값을 사용한다. 
                    char checkChar = hand.charAt(0);
                    switch (checkChar) {
                    case 'l':
                        answer += "L";
                        leftPoint = pointAL.get(number);
                        break;
                    case 'r':
                        answer += "R";
                        rightPoint = pointAL.get(number);
                        break;
                    }
                }
                // 왼손이 더 가까울 경우 
                else if (leftD < rightD) {
                    answer += "L";
                    leftPoint = pointAL.get(number);
                }
                // 오른손이 더 가까울 경우 
                else {
                    answer += "R";
                    rightPoint = pointAL.get(number);
                }
                break;
            }
        }
        return answer;
    }
    
    
    /**
     * 키패드를 좌표로 나타냈을 경우의 위치 정보 
     * @author kwakjuheon
     * @since Sep 22, 2020
     *
     */
    public class Point {
        // 키패드의 번호 값 
        int value;
        // x 좌표 
        int x;
        // y 좌표 
        int y;
        
        public Point(int value, int x, int y) {
            this.value = value;
            this.x = x;
            this.y = y;
        }
    }
}
