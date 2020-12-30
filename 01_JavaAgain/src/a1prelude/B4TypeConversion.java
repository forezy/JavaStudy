package a1prelude;

public class B4TypeConversion {
    public static void main(String a[]){
        /*
    automatic data type conversion
     */
        // 运算:由小到大，byte -> short -> int -> long -> float -> double
        // 注意：不能 大 -> 小
        int i = 1;
        double D = 1.0;
        System.out.println(Tool.getType(i + D)); // double
            // 运算结果最小为 int 类型的，不会有 byte,short,char类型!
        byte b = 2;
        short s = 1;
        char c = 'a';//97
        System.out.println(Tool.getType(b + s)); // int
        System.out.println(Tool.getType(b + c)); // int
        System.out.println(Tool.getType(b + b)); // int

        // 赋值 + 运算
        double D2 = b + s;
        double D3 = 3;//本质就是这么回事！
        double D4 = i;
        System.out.println(Tool.getType(D2)); // double

        /*
        casts(type coercion)
         */
        // 大 -> 小 ，小 -> 大，都行！
        //错误：(int)4.0  不是 int(4.0) !!!
        System.out.println(Tool.getType((int)D4));  // int
        System.out.println(Tool.getType((double)i)); // double
    }
}

class Tool{
    public static String getType(Object a){
        return a.getClass().toString();
    }
}