package test.algorithm.programmers.solution.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FailureRate implements Comparable<FailureRate> {

    /**
     * stage 번호
     */
    private final int stage;

    private int tryCount;

    private int failureCount;
    
    public FailureRate() {
        this.stage = 0;
        this.tryCount = 0;
    }

    public FailureRate(int stage, int tryCount) {

        if (tryCount < 1) {
            throw new IllegalArgumentException("tryCount가 1보다 작음");
        }
        this.stage = stage;
        this.tryCount = tryCount;
    }
    
    public FailureRate (int stage) {
        this.stage = stage;
        this.tryCount = 1;
    }

    @Override
    public int compareTo(FailureRate o) {
        
        if (this.getFailureRate() > o.getFailureRate()) {
            return -1;
        } else if (this.getFailureRate() < o.getFailureRate()) {
            return 1;
        } else {
            return (int) this.stage - o.stage;
        }
    }
    

    public int getFailureCount() {
        return failureCount;
    }

    public double getFailureRate() {
        if (tryCount < 1) {
            return 0;
        }
        return ((double) failureCount / tryCount);
    }

    public int getStage() {
        return stage;
    }
    
    public void setTryCount(int tryCount) {
        this.tryCount = tryCount;
    }

    /**
     * 
     * @author kwakjuheon
     * @since Sep 25, 2020
     */
    public void incCount() {
        failureCount++;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("FailureRate2 [stage=");
        builder.append(stage);
        builder.append(", failureCount=");
        builder.append(failureCount);
        builder.append(", tryCount=");
        builder.append(tryCount);
        builder.append(", failureRate=");
        builder.append(getFailureRate());
        builder.append("]");
        return builder.toString();
    }


    /**
     * 
     * @author kwakjuheon
     * @since Sep 25, 2020
     * @param N      전체 스테이지 개수
     * @param stages 진행된 스테이지의 배열
     * @return
     */
    public static int[] solution(int N, int[] stages) {

        // 1. 스테이지 객체 만들기

        Map<Integer, FailureRate> stageMap = new HashMap<>();
        
        Arrays.sort(stages);
        
        int totalLen = stages.length;
        
        for (int i = 0; i < N; i++) {
            stageMap.put(i + 1, new FailureRate(i + 1));
        }

        // 2. 스테이지별 실패횟수 계산

        for (int s : stages) {
            // map 에 존재하지 않은 stage인 경우 무시함
            if (!stageMap.containsKey(s)) {
                continue;
            }

            stageMap.get(new Integer(s)).incCount();

        }
        
        int tempCount = 0;
        
        // 실패율 계산
        for (int i = 0; i < N; i++) {
            FailureRate fr1 = stageMap.get(new Integer(i + 1)); 
            if (fr1 != null) {
                fr1.setTryCount(totalLen);
                tempCount = fr1.getFailureCount();
                totalLen -= tempCount;
            }
        }

        
        // 3.실패율 비교

        List<FailureRate> frList = new ArrayList<>(stageMap.values());

        Collections.sort(frList);
        
        int[] result = new int[N];

        int index = 0;
        for (FailureRate fr : frList) {
            result[index++] = fr.getStage();
        }

        return result;
    }

    public void run() {
        int[] result = solution(4, new int[] { 4, 4, 4, 4, 4 });
        System.out.println(Arrays.toString(result));
        int[] result1 = solution(5, new int[] { 2, 1, 2, 6, 2, 4, 3, 3 });
        System.out.println(Arrays.toString(result1));
        int[] result2 = solution(8, new int[] { 1, 2, 3, 4, 5, 6, 7 });
        System.out.println(Arrays.toString(result2));        
    }
}
