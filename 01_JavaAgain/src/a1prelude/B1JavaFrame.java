package a1prelude;
/**
 * @author moker
 * @editor idea
 * @time 2020-12-29
 */
//错误1：少写static，右键没有 "运行"
//错误2：少写main()里面的 String args[]，右键没有 "运行"
//注意：String args[]  <==>  String[] a  <==>  String a[]，其中，String的 S 为大写！
public class B1JavaFrame {
    public static void main(String args[]){
        System.out.println("java程序的主要框架");
        //有参构造更方便。
        SubClass objectName = new SubClass("对象名字",18);
        String name = objectName.getName();//方法调用
        System.out.println(name);
        int age = objectName.getAge();
        System.out.println(age);
    }
}

//错误1:同一个java类中（同一个.java文件），只能有一个 public 的 class
//注意：构造器的格式：

class SubClass{
    //定义类的属性
    private String name;
    private int age;

    //无参构造，有参构造
    public SubClass(){}
    public SubClass(String name,int age){
        this.name = name;
        this.age = age;
    }

// 右键，'生成' -> 'getter and setter',就会自动生成下面的代码：javaBean
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
