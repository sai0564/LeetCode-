import java.util.*;
public class _128LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int longestSequence  = 1;
        int currentIdx = Integer.MIN_VALUE;
        int count = 0;
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int adding : nums){
            set.add(adding);
        }
        for(int i :set){
            if(!set.contains(i-1)){
                count  = 1;
                currentIdx = i;
                while(set.contains(currentIdx+1)){
                    currentIdx++;
                    count++;
                }
            }
            longestSequence=Math.max(longestSequence,count);
        }
        return longestSequence;
    }
}
