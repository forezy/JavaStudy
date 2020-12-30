package a5OtherType;

public class B1StaticKeyword {
    public static void main(String[] args){

    }
}
class StaticTestType{
    private String name = "StaticTestType";
    private static String staticName;
    public StaticTestType(String name){
        this.name = name;
//      StaticType.staticName = staticName;//可以到处，类名.static属性!
//      this.staticName = staticName;每次创建对象都会被更改，那还有什么意义？
    }

    public static void staticFun1(){
        System.out.println("我是static方法：staticFun()");
//        System.out.println(this.name); 报错，static方法中不能this，super关键字。
//        System.out.println(name);报错，static方法不能调用非static的属性和方法。
    }
    public static void staticFun2(){
        System.out.println("我是static方法：staticFun2()");
        staticFun1(); //本类中可直接调用 static 方法
    }
}
