package a4classobject;

public class B4FuncOverload {
    public static void main(String args[]){
        new B4FuncOverload().func1();
        new B4FuncOverload().func1("Tom");
        new B4FuncOverload().func1("Jack",19);
//        new B4FuncOverload.func1("Jack","19"); 报错，开始忘记加括号了！

    }
    /*
    方法重载：
    方法名相同
    方法的参数类型，参数个数不一样
    方法的 返回类型 可以不相同
    方法的 修饰符 可以不相同
    main 方法也可以被重载
     */
    public static void func1(){
        System.out.println("我是func1");
    }
    public static void func1(String name){
        System.out.println("我也是func1,名叫"+name);
    }
    public static String func1(String descript,int age){
        System.out.println("我也是func1,名叫"+descript+",今年"+age+"岁");
        return descript;
    }

}
