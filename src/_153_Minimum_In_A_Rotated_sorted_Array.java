public class _153_Minimum_In_A_Rotated_sorted_Array {
        public int findMin(int[] nums) {
            int min =Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                int temp = nums[i];
                min = Math.min(temp,min);
            }
            return min ;
        }
}
