package a4classobject;
/*
多态：父类的属性和方法，被重写方法的看子类
所以，子类只能在重写父类方法中调用自己的属性，呈现多态！
 */
public class B8Polymorphism {
    public static void main(String args[]){
        SuperType1 st1 = new  SubType1();
        st1.superFun1();//运行的是子类重写后的方法，父类被重写的方法没用了！
        st1.superFun2();//可以父类的没被重写的方法！
//        st1.subFun();报错，不能子类特有的方法
        SuperType1 st2 = new  SubType2();
        st2.superFun1();//运行的是子类重写后的方法
        st2.superFun2();

        //上面太麻烦了，用函数实现:
        System.out.println("========函数简化，运行时多态=======");
        myShow(new SubType1()); //才发现本类直接 fun();不用类名.fun();
        myShow(new SubType2());

        System.out.println("========强制转型，我就要用子类特有的方法和属性！========");
        SubType1 sb1 = (SubType1)st1;
        sb1.subFun();
        /*
        避免强转不合法：instance of关键字：
        判断某个对象是否是某个类的实例（对象）。
         */
    }
    public static void myShow(SuperType1 st){
        st.superFun1();
        st.superFun2();
    }
}
//调用子类特有的属性和方法
class SuperType1{
    String name = "SuperType1";
    int age = 44;
    //被重写
    public void superFun1(){
        System.out.println("我是"+name+"，今年"+age+"岁。");
    }
    //没被重写
    public void superFun2(){
        System.out.println("我是SuperType1中的方法superFun2()");
    }
}
class SubType1 extends SuperType1{
    String nickName = "小娟";//子类特有的属性
    @Override
    public void superFun1(){
        System.out.println("我的小名叫"+nickName);
    }
    //特有的方法
    public void subFun(){
        System.out.println("我是SubType1中的方法subFun()");
    }
}
class SubType2 extends SuperType1{
    String nickName = "小陈";
    @Override
    public void superFun1(){
        System.out.println("我的小名叫"+nickName);
    }
    //子类特有的方法
    public void subFun(){
        System.out.println("我是SubType2中的方法subFun()");
    }
}