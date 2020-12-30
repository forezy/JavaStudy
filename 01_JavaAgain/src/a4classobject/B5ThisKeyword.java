package a4classobject;

public class B5ThisKeyword {
    public static void main(String args[]){

    }
}
class Class1{
    private String name;
    private int age;
    public Class1(){}

    public Class1(String name){
        this.name = name;
    }
    public Class1(int  age){
        this.age =  age;
    }
    public Class1(String name,int age){

        this(name);
        //有什么用？相比 this.name = name;不就少些了一个name;
//        this(age);  //三者都抢第一，不然报错！
//        this(); //调用空参构造器。

//   等效：this.name = name;
//        this.age =  age;
    }
}
