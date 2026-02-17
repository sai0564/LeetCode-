public class RearrangeArrayElementsBySign2149 {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] array = new int[n];
        int PositiveIndex = 0;
        int NegativeIndex = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                array[NegativeIndex] = nums[i];
                NegativeIndex += 2;
            } else {
                array[PositiveIndex] = nums[i];
                PositiveIndex += 2;
            }
        }
        return array;
    }
}
