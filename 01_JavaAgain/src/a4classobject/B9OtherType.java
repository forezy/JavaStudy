package a4classobject;
/*
包装类：
总父类：Number
子类：
Integer  <--->  int
Byte  <--->  byte
Character  <--->  char
Vector  <--->  数组！
……
 */
public class B9OtherType {
    public static void main(String[] args){
        Integer ig1 = new Integer(123);
        Integer ig2 = 123;//自动装箱
        int i1 = ig1;//自动拆箱
        int i2 = ig1.intValue();//调用方法
        String S1 = "123";
        String S2 = String.valueOf(i2);//基本数据类型 --> 字符串

        //这或许就是包装类的优势所在了：
        int i3 = Integer.parseInt(S1);//字符串 --->基本数据类型
    }
}
