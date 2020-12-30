package a1prelude;
/**
 * @author moker
 * @editor idea
 * @time 2020-12-29
 */
//java 每个变量必须先定义后使用
//作用域：定义所在的 {} 中
public class B2VarialeAndType {
    public static void main(String args[]){
        // 8 种基本数据类型
        byte b = 8;  // 8 bit（位）
        short s = 8;  // 2 byte（字节），16 bit
        int i = 8;  //4 byte
        long l = 8L;  //8 byte

        double d = 8.0; //浮点型
        float f = 8.0F;

        char c1 = 'a';  //注意：字符单引号：'a'
        char c2 = 8;  // ASCll码！
        char c3 = '中';  //可以一个中文！一个就行
        char c4 = '\n';  //可以转移字符，\n,\t等
        char c5 = '\u0043';  //可以 unicode 编码

        boolean B1 = true;  // 小写的 true,false
        boolean B2 = false;

        //引用数据类型：除了 8 中基本数据类型，其余的都是引用数据类型
        //举例：数组，类（String，其他API中的类），对象，接口
        String S1 = "";  //可以空串
        String S2 = "字符串";
        String S3 = "a";  //可以单个
        String S4 = "aaa\taaa";  //转义字符，仍然生效
        String S5 = "aaa\\taaa";  //输出字符形式的 \t
    }
}
