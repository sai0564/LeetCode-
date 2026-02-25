import java.util.*;
public class _229_Majority_Element_II {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 =0; int cnt2 = 0;
        int ele1 = Integer.MIN_VALUE; int ele2 = Integer.MIN_VALUE;
        //moors algo
        for(int i = 0;i<nums.length;i++){
            if(cnt1 == 0 && ele2 != nums[i]){
                cnt1 =1;
                ele1 = nums[i];
            }
            else if(cnt2 == 0 && ele1 != nums[i] ){
                cnt2 = 1;
                ele2 = nums[i];
            }
            else if(ele1 == nums[i]){cnt1++;}
            else if(ele2 == nums[i]){cnt2++;}
            else{ cnt1--;cnt2--;}
        }

        //checking the majority or not
        cnt1 =0; cnt2 =0;
        int check =  nums.length / 3;
        for(int i = 0; i< nums.length;i++){
            if(nums[i] == ele1){
                cnt1++;
            }
            if(nums[i] == ele2)
                cnt2++;
        }

        List<Integer> list = new ArrayList<>();
        if(cnt1 >check){
            list.add(ele1);
        }
        if(cnt2 > check){
            list.add(ele2);
        }
        return list;
    }
}
