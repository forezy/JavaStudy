package a5OtherType;
/*
anonymous object:
    new TypeName();
anonymous child type:
    please look below:
 */
public class B4AnonymousType {
    public static void main(String args[]){
        //anonymous child type:
        //So,the anonymous child type can have just one instance!
        //The st1 is one instance of the child type,but it is declared by the super type!
        SuperType1 st1 = new SuperType1(){
            @Override
            public void superFun1(){
                System.out.println("I am anonymous child type,and have rewritten super type's superFun1.");
            }
        };
        st1.superFun1();

        //传入匿名子类的匿名对象：
        myShow(new SuperType1(){
            @Override
            public void superFun1(){
                System.out.println("I am anonymous child type,and I have a anonymous instance.");
            }
        });
    }
    public static void myShow(SuperType1 p){
        p.setName("the actual parameter is anonymous object,but the formal parameter has a name.");
        System.out.println(p.toString());
        System.out.println(p.getName());
    }
}
class SuperType1{
    private String name;
    public  void superFun1(){
        System.out.println("I am superFun1.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
