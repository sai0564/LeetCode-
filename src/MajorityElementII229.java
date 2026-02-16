import java.util.*;
public class MajorityElementII229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> solution = new ArrayList <> ();
        for(int i =0;i<nums.length;i++){
            int cnt =0;
            for(int j =0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
            if(cnt > nums.length/3 && !solution.contains(nums[i])){
                solution.add(nums[i]);
            }
        }
        return solution;
    }
}
