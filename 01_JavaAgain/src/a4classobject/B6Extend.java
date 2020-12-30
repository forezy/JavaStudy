package a4classobject;

public class B6Extend {
    public static void main(String args[]){
        SuperClass superObject = new SuperClass();
        SubClass subObject = new SubClass();

        superObject.superFunction();
        subObject.superFunction();
        System.out.println(subObject.name);
//        System.out.println(subObject.attribute); 子类不能访问父类的private,但也继承了！

        //static关键字
        SuperClass.superStaticFun();

        //super关键字
        subObject.subFunction();

        
    }
}
class SuperClass{
    String name = "SuperClass";
    private String attribute = "Private Super Attribute";
    //父类方法为 public ，则子类随便怎么重写；为private，则子类怎么也不能重写！
    //子类中重写的方法的访问权限不能低于父类中方法的访问权限
    public void superFunction(){
        System.out.println("我是superFunction");
    }
    public static void superStaticFun(){
        System.out.println("我是superStaticFun");
    }
}
/*
java 中，不能多继承，只能extends一个父类 ，通过接口来弥补这个缺陷。
 */
class SubClass extends SuperClass{
    String name = "SubClass";
    /*
    方法的重载: 在同一个类中,出现多个同名的方法,参数列表不同,与返回值类型,修饰符无关
    方法的重写: 子类中出现和父类中一模一样的方法(包括返回值类型,方法名,参数列表)
        注意：返回值类型，void和基本数据类型（double,int等）必须相同，
             引用数据类型子类小于父类（String < Object等）。

     */
    @Override //重写的方法可以使用 @Override 注解来标识
    public void superFunction(){
        System.out.println("长江后浪推前浪");
    }
//    @Override //报错！不能重写父类的static方法
//    public void superStaticFun(){
//        System.out.println("我就要重写父类的static方法");
//    }
    public void subFunction(){
        System.out.println("我（子类）就要调用父类中被我重写的方法！");
        super.superFunction();
    }
}
