package a5OtherType;
/*
类的成员之四：code block

 */
public class B2CodeBlock {
    public static void main(String[] args){
        new CodeBlockType();//static 只会执行一次，先加载类（执行static）,在创建对象（执行non static）
        //static 上面执行了一次，下面加载类的时候就不会再执行 static code block了。
        System.out.println("======2=====");
        CodeBlockType cbObject1 = new CodeBlockType();//只有non static会执行！
        System.out.println("======3=====");
        //这或许就是code block的用处：
        CodeBlockType cbObject2 = new CodeBlockType();//每创建一个Object都会执行non static的
        cbObject2.myShow(); //创建（new）的时候才执行
        System.out.println("======4=====");
    }
}
class CodeBlockType{
    //static block 随类的加载而执行，只能执行一次；
    //只能调用static结构（static的属性和方法等）
    static{
        System.out.println("我是static code block.");
    }

    //non static code block随对象的创建而执行
    //可调用结构（属性和方法）
    {
        System.out.println("我是non static code block.");
    }
    public void myShow(){
        System.out.println("我是CodeBlockType类中的myShow()方法");
    }

}
