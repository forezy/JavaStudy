package a3array;

public class B2TwoDimensionArray {
    public static void main(String args[]){
        int[][] intArray1 = new int[][]{{1,2,3,4},{1,2},{1,2,3}};
        int[][] intArray2 = {{1,2,3,4},{1,2},{1,2,3}}; //自动类型判断
        int[][] intArray3 = new int[][]{{1,2,3,4},{1,2},{1,2,3}};
        int[] intArray4[] = new int[][]{{1,2,3,4},{1,2},{1,2,3}};
        int[] intArray5[] = {{1,2,3,4},{1,2},{1,2,3}}; //自动类型判断

        String[][] sArray1 = new String[3][4];
        sArray1[1] = new String[4];
//        sArray1[0][1] = new String[4]; 报错！ 只有一个[]才对
        String[][] sArray2 = new String[3][];
//        String[][] sArray3 = new String[][4]; 报错!
        String[][] sArray4 = new String[][]{{"1","2","3","4"},{"1","2","3"},{"1","2"}};

    }
}
