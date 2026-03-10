class _34_Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    private static int LowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int  res = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] >= target){
                res = mid;
                high = mid  -  1;
            }
            else{
                low  = mid + 1;
            }
        }
        return res;
    }
    private static int UpperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int  res = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] > target){
                res = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return res;
    }
    public int[] searchRange(int[] arr, int target){
        int lb = LowerBound(arr,target);
        if( lb == arr.length || arr[lb] != target ) {
            return new int[]{-1, -1};
        }
        return new int[]{lb,UpperBound(arr,target) -1 };
    }
}