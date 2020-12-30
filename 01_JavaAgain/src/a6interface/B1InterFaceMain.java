package a6interface;
/*
One type cannot extend 2 and more than 2 super types,
but one type can implements many interfaces.
 */
public class B1InterFaceMain {
    public static void main(String args[]){
        Person tom = new Person();
        tom.setName("Tom");
        //必须重写的话，这个接口不就只多了个规范的作用？
        tom.fly();
        tom.attack();
        System.out.println("============1================");

        //interface's polymorphism
        Fly p2 = new Person();
//        p2.setName("p2");不同之处：报错，interface Fly 中没有 setName()方法，多态性！
        p2.fly();
//        p2.attack(); 报错interface Fly的p2不能访问Person()实现的另一个interface Attack的方法！
        System.out.println("============2================");
        //So the polymorphism functions when there are many types implementing one interface!

        //the going-on polymorphism:
        myShow1(new Person());//non-anonymous implements type's anonymous object!
        myShow1(new Bird());

        System.out.println("============3================");
        myShow2(new Person(){
            @Override
            public void fly(){
                System.out.println("anonymous object flies!");
            }
            @Override
            public void attack(){
                System.out.println("anonymous object attacks!");
            }
        });
    }
    public static void myShow1(Fly f){
        f.fly();
    }
    public static void myShow2(Person p){
        p.fly();
        p.attack();
    }
}
/*
Before jDK7.0,the interface can only have public static final variables and abstract functions.

Attention:
interface cannot be instantiated!That's to say,it cannot have objects!
没有构造器。
 */
interface Fly{
    //set regulations:
    public static final int maxSpeed = 100;
    public void fly();
}
interface Attack{
    //set rules:
    public static final int maxBullet = 10;
    public void attack();
}

//the implement type must override all the interfaces' functions,or it must be continuous abstract.
class Person implements Fly,Attack{
    private String name;
    @Override
    public void fly(){
        System.out.println("I can fly by plane!");
    }
    @Override
    public void attack(){
        System.out.println("I attack with a gun!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Bird implements Fly{
    @Override
    public void fly(){
        System.out.println("I am a bird,and I can fly with my wings!");
    }

}