import java.util.*;
public class _560_SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int cnt = 0;
        int presum =0;
        HashMap<Integer,Integer> PrefixCount  = new HashMap<>();
        PrefixCount.put(0,1);
        for(int i  =0;i<nums.length;i++){
            presum += nums[i];
            int remove = presum - k;
            if(PrefixCount.containsKey(remove)){
                cnt += PrefixCount.get(remove);
            }
            PrefixCount.put(presum,PrefixCount.getOrDefault(presum,0)+1);
        }
        return cnt;
    }
}
