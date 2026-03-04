import java.util.*;
public class _119_Pascals_TriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long value = 1;
        row.add((int)value);
        for(int i = 1;i<=rowIndex;i++){
            value = value * (rowIndex - i + 1);
            value /= i;
            row.add((int)value);
        }
        return row;
    }
}
