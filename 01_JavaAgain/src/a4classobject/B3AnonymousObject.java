package a4classobject;

public class B3AnonymousObject {
    public static void main(String args[]){
        //匿名对象调用方法
        new Tools().myPrint();
        //匿名对象调用属性就没有任何意义！两次都new的对象名一样，却不是同一个
    }
}
class Tools{
    private String name;
    private String funcDescript;
    public Tools(){}
    public Tools(String name,String funcDescript){
        this.name = name;
        this.funcDescript = funcDescript;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
//        return name; 不加this.似乎也可以！本类中可以直接访问 private!
    }
    public void setDes(String funcDescript){
        this.funcDescript = funcDescript;
    }
    public String getDes(){
        return funcDescript;
    }
    public void myPrint(){
        System.out.println("===========匿名对象你好，很高兴认识你！=========");
    }
}
