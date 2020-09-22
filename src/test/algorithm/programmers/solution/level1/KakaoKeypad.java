package test.algorithm.programmers.solution.level1;

import java.util.ArrayList;

public class KakaoKeypad {
    // 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5
    // L R L L L R L L R R L

    public void run() {
        System.out.println("************************"); // LRLLLRLLRRL
        System.out.println("1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5");
        System.out.println(solution(new int[] { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 }, "right"));
        System.out.println("************************"); // LRLLRRLLLRR
        System.out.println(solution(new int[] { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 }, "left"));
        System.out.println("************************"); // LLRLLRLLRL
        System.out.println(solution(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }, "right"));
    }

    public String solution(int[] numbers, String hand) {
        
        String answer = "";
        // 맨해튼 거리 구하기 
        // |(x2 - x1) + (y2 - y1)|
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
                int leftD = Math.abs(currPoint.x - leftPoint.x) + Math.abs(currPoint.y - leftPoint.y);
                int rightD = Math.abs(currPoint.x - rightPoint.x) + Math.abs(currPoint.y - rightPoint.y);
                
                if (leftD == rightD) {
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
                } else if (leftD < rightD) {
                    answer += "L";
                    leftPoint = pointAL.get(number);
                } else {
                    answer += "R";
                    rightPoint = pointAL.get(number);
                }
                break;
            }
        }
        return answer;
    }
    
    public class Point {
        int value;
        int x;
        int y;
        
        public Point(int value, int x, int y) {
            this.value = value;
            this.x = x;
            this.y = y;
        }
    }
}
