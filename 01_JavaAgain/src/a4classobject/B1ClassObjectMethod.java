package a4classobject;

public class B1ClassObjectMethod {
    public static void main(String args[]){
        B1ClassObjectMethod Class1 = new  B1ClassObjectMethod();
        Class1.method();  // 在主类中创建自己类的对象！

        B1ClassObjectMethod.method(); // 方法前 添加 static ，可以直接类调用！
    }
    // 竟然可以在主类中定义方法，然后主类自己用！！
    public static void method(){
        System.out.println("在主类中定义方法！");
    }
}

class SubClassA{
    SubClassA Class2 = new SubClassA();
    //非主类，根本没必要在自己内部创建自己的对象！想执行，还得在主类中创建对象。
    //但可以自己调用自己内部的方法，几个方法嵌套！
    public void method1(){
        System.out.println("非主类中的方法1");
        Class2.method2();
//        Class2.method1(); 里面就递归了！
    }
//    Class2.method1(); 外面永远不会被调用！

    public void method2(){
        System.out.println("非主类中的方法2");
    }

}
