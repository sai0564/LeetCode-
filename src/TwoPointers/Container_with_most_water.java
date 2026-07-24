package TwoPointers;

public class Container_with_most_water {
    public static int area(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max_area = Integer.MIN_VALUE;
        while (left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            max_area = Math.max(w * h, max_area);
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return max_area;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.print(area(height));
    }
}
