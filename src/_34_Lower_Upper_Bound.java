public class _34_Lower_Upper_Bound {
        private static int LowerBound(int[] arr, int target) {
            int low = 0;
            int high = arr.length - 1;
            int  res = -1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == target) {
                    res = mid;
                    high = mid - 1;
                }
                else if(arr[mid] < target){
                    low = mid  +  1;
                }
                else{
                    high  = mid - 1;
                }
            }
            return res;
        }
        private static int UpperBound(int[] arr, int target) {
            int low = 0;
            int high = arr.length - 1;
            int  res = -1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == target) {
                    res = mid;
                    low = mid + 1;
                }
                else if(arr[mid] < target){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
            return res;
        }
        public int[] searchRange(int[] arr, int target){
            if(arr.length == 0) {
                return new int[]{-1, -1};
            }
            int lower  = LowerBound(arr,target);
            int upper = UpperBound(arr,target);
            return new int[]{lower,upper};
        }
}
