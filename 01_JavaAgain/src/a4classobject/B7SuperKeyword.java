package a4classobject;

public class B7SuperKeyword {
    public static void main(String args[]){

    }
}
class SuperClass2{
    private int id = 2;
    private String name = "SuperClass2";
    private int age = 19;
    public SuperClass2(){}  //父类无空参构造，子类会报错！父类必须有空参！
    public SuperClass2(String name,int age){
        this.name  = name;
        this.age = age;
    }

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
class SubClass2 extends SuperClass2{
    //默认自动有：super();传入父类的空参构造器
    private String name;
    private int age;
    private int id;
    private String nickName;
    public SubClass2(String name,int age,int id){
        super(name,age); //super(),this()都只能在第一行！所以不能共存!
        this.id = id;
    }
    public SubClass2(String name,int age,int id,String nickName){
        this(name,age,id);
        this.nickName = nickName;
    }
}