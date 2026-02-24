import java.util.*;
public class _118_Pascal_Triangle {
    public static List<Integer> generateRow(int numRows) {
        List<Integer> row = new ArrayList<>();
        int ans = 1;
        row.add(ans);
        for(int i =1;i<numRows;i++){
            ans = ans * (numRows - i)/i;
            row.add(ans);
        }
        return row;
    }
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> TriangleRow = new ArrayList<>();
        for(int i = 1;i<=numRows;i++){
            TriangleRow.add(generateRow(i));
        }
        return TriangleRow;
    }
}
