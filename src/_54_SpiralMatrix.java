import java.util.*;
public interface _54_SpiralMatrix {
    public default List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> Sol = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length-1;
        int right = matrix[0].length-1;
        int left = 0;

        while(top<=bottom && left<= right){
            //print the row
            for(int i = left;i<=right;i++){
                Sol.add(matrix[top][i]);
            } top++;
            // print the col from top to bottom
            // from right and right is constant  we are printing the col
            for(int i = top;i<=bottom;++i){
                Sol.add(matrix[i][right]);
            }
            right--;
            // gone thorugh the left col from right
            //bottom remain row is remain constant
            if(top<=bottom){
                for(int i =right;i>=left;i--){
                    Sol.add(matrix[bottom][i]);
                } bottom--;
            }
            //from bottom to top

            if(left<=right){
                for(int i = bottom;i>=top;i--){
                    Sol.add(matrix[i][left]);
                }
                left++;
            }
        }
        return Sol;
    }
}
