public class SortArrayByParityII922 {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int PosIndex = 0;
        int NegIndex = 1;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & 1) == 1) {
                arr[NegIndex] = nums[i];
                NegIndex += 2;
            }
            else
            {
                arr[PosIndex] = nums[i];
                PosIndex += 2;
            }
        }
        return arr;
    }
}
