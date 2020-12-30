package a3array;
/*
数组元素默认初始值：
int:0，float/double:0.0，char:\u0000，boolean:false，String:null.
 */
public class B1OneDimensionArray {
    public static void main(String args[]){
        //注意：数组的成员 必须 全部一致！类型、长度等！
        int[] intArray;
        intArray = new int[5];
        for(int i=0; i < intArray.length;i++){
            System.out.println(intArray[i]);
        }

        int[] intArray2 = {1,2,3,4,5};//自动类型判断

        String[] sArray1 = new String[5];//无值，默认为 null 不是"null"!
        Tools.stringArrayTraversal(sArray1);
        String[] sArray2 = new String[]{"sa1","sa2"};
        Tools.stringArrayTraversal(sArray2);
//        String[] sArray3 = new String[2]{"sa1","sa2"}; 错误！不能有数有真相！
    }
}
class Tools{
    // 数组作为形参！
    public static void intArrayTraversal(int[] arr){
        for(int i=0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void stringArrayTraversal(String[] arr){
        for(int i=0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}