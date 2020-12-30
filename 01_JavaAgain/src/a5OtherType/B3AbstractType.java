package a5OtherType;
/*
abstract type:
Sometimes,the super type needn't be concrete.It is just a model.
Abstract type cannot go with private , final and static.
 */
public class B3AbstractType {
    public static void main(String[] args){
//        AbstractType1 at1 = new AbstractType1();
//        报错：'AbstractType1' is abstract; cannot be instantiated

    }
}
//包含抽象方法，一定抽象类
//abstract type:不能实例化（不能造对象）
abstract class AbstractType1{
    private String name;
//  private String name = "AbstractType1"; 命名之后警告，或许可以final了！
    //报错：abstract function cannot have a body!
//    public abstract void AbstractFun(){
//
//    }
    public abstract void AbstractFun();

}
//子类要么继续abstract，要么instantiate all abstract functions.
class InstanceType1 extends AbstractType1{
    private String specialName;
// 类中有abstract,类前必须声明 abstract
//    public abstract void AbstractFun(){
    //重写父类 abstract 的方法，不能加 abstract!
    public void AbstractFun(){
        System.out.println("I have instantiated the AbstractFun()");
    };
}