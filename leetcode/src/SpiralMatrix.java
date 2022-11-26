import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    //Top, Bottom : row
    //Left, Right : column
    // maxtrix.length = length of row
    // matrix[0].length = length of col

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        if(matrix.length == 0) return result;

        int top = 0;
        int bottom = matrix.length - 1; // maxtrix.lenth = length of row
        int left =0;
        int right = matrix[0].length -1; // matrix[0].length = length of col

        int size = matrix.length * matrix[0].length;

        while(result.size() < size){
            for(int i = left; i<= right && result.size() < size; i++){
                result.add(matrix[top][i]);
            }

            top++;
            for(int i = top; i<=bottom && result.size() < size; i++){
                result.add(matrix[i][right]);
            }

            right--;
            for(int i= right; i>=left && result.size() < size; i--){
                result.add(matrix[bottom][i]);
            }

            bottom--;
            for(int i= bottom; i>=top && result.size() < size; i--){
                result.add(matrix[i][left]);
            }
            left++;
        }
        return result;
    }
    public static void main(String[] args) {
        int num[][] = {{1,2,3},{4,5,6}, {7, 8, 9}};

        List<Integer> result = SpiralMatrix.spiralOrder(num);

        System.out.println(result);
    }

}
