public class _153_Minimum_In_A_Rotated_sorted_Array {
        public int findMin(int[] arr) {
            int low = 0;
            int high = arr.length -1;
            int min = Integer.MAX_VALUE;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(arr[low]<=arr[high]){
                    min = Math.min(arr[low],min);
                    break;
                }
                if(arr[low]<=arr[mid]){
                    min =Math.min(min,arr[low]);
                    low = mid +1;
                }
                else{
                    min =Math.min(min,arr[mid]);
                    high = mid - 1;
                }
            }
            return  min;
        }
}
