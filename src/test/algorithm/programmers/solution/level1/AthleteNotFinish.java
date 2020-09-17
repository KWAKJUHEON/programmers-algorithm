package test.algorithm.programmers.solution.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * hashMap을 사용해서 완주하지 못한 운동선수를 찾는 클래스
 * @author JHKwak
 *
 */
public class AthleteNotFinish {
    
    /**
     * 완주하지 못한 운동선수를 찾는 프로그램을 실행하는 함수
     * @author JHKwak
     * @since 2020. 9. 15
     */
    public void run() {
        System.out.println(solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
        System.out.println(solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"}, new String[] {"josipa", "filipa", "marina", "nikola"}));
        System.out.println(solution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"}));
    }
    
    /**
     * 완주하지 못한 운동선수를 찾는 함수
     * @author JHKwak
     * @since 2020. 9. 15
     * @param participant 마라톤에 참여하는 참여자들의 리스트
     * @param completion 참여한 사람들 중 마라톤을 완주한 사람들의 리스트
     * @return 마라톤을 완주하지 못한 사람의 이름
     */
    public String solution(String[] participant, String[] completion) {
        
        Map<String, Integer> resultHashMap = new HashMap<>();

        for (String participantItem: Arrays.asList(participant)) {
            resultHashMap.put(participantItem, resultHashMap.getOrDefault(participantItem, 0) + 1);
        }
        
        for (String completionItem: Arrays.asList(completion)) {
            resultHashMap.put(completionItem, resultHashMap.getOrDefault(completionItem, 0) - 1);
        }
        
        for (String hashItem: resultHashMap.keySet()) {
            Integer value = resultHashMap.get(hashItem); 
            if (value == 1) {
                return hashItem;
            }
        }
        
        return null;
    }

}
