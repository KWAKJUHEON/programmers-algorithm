package test.algorithm.programmers.solution.level1;

public class KakaoKeypad {
    // 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5
    // L R L L L R L L R R L

    public void run() {
        System.out.println("************************"); // LRLLLRLLRRL
        System.out.println(solution(new int[] { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 }, "right"));
        System.out.println("************************"); // LRLLRRLLLRR
        System.out.println(solution(new int[] { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 }, "left"));
        System.out.println("************************"); // LLRLLRLLRL
        System.out.println(solution(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }, "right"));
    }

    public String solution(int[] numbers, String hand) {

        String answer = "";

        int prevL = 10;
        int prevR = 10;
        int disL = 1;
        int disR = 1;

        for (int item : numbers) {

            if (item % 3 == 1) {
                answer += "L";
                prevL = item;
                continue;
            } else if (item != 0 && item % 3 == 0) {
                answer += "R";
                prevR = item;
                continue;
            } else if (item == 0) {
                switch (prevL) {
                case 1:
                    disL += 1;
                case 4: case 2:
                    disL += 1;
                case 7: case 5:
                    disL += 1;
                    break;
                case 10:
                    disL = 10;
                    break;
                case 8:
                    break;
                }
                switch (prevR) {
                case 3:
                    disR += 1;
                case 6: case 2:
                    disR += 1;
                case 9: case 5:
                    disR += 1;
                    break;
                case 10:
                    disL = 10;
                    break;
                case 8:
                    break;
                }
            } else {
                switch (item) {
                case 2:
                    switch (prevL) {
                    case 0: case 7:
                        disL += 1;
                    case 4:
                    case 8:
                        disL += 1;
                        break;
                    case 10:
                        disL = 10;
                    }
                    switch (prevR) {
                    case 9: case 0:
                        disR += 1;
                    case 6:
                    case 8:
                        disR += 1;
                        break;
                    case 10:
                        disR = 10;
                    }
                    break;
                case 5:
                    switch (prevL) {
                    case 1:
                    case 7:
                    case 0:
                        disL += 1;
                        break;
                    case 10:
                        disL = 10;
                    }
                    switch (prevR) {
                    case 3:
                    case 9:
                    case 0:
                        disR += 1;
                        break;
                    case 10:
                        disL = 10;
                    }
                    break;
                case 8:
                    switch (prevL) {
                    case 1: case 2:
                        disL += 1;
                    case 4: case 5:
                        disL += 1;
                        break;
                    case 10:
                        disL = 10;
                    }
                    switch (prevR) {
                    case 3:
                        disR += 1;
                    case 6:
                        disR += 1;
                        break;
                    case 10:
                        disL = 10;
                    }
                    break;
                }
            }
            if (disL < disR) {
                answer += "L";
                prevL = item;
            } else if (disL > disR) {
                answer += "R";
                prevR = item;
            } else {
                answer += hand.substring(0, 1).toUpperCase();
                if (hand.substring(0, 1).equals("l")) {
                    prevL = item;
                } else {
                    prevR = item;
                }
            }
            disL = 1;
            disR = 1;
        }
        return answer;
    }
}
