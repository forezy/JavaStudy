package a4classobject;

public class B2ObjectArray {
    public static void main(String args[]) {
        Student[] stus = new Student[20];
        String name;
        int age = 18; //可以定义一个 随 i 变化的函数来 定义age
        //批量赋值
        for (int i = 0; i < 20; i++) {
            name = "class" + i;
            age = 100 - (i - 10) * (i - 10);
            stus[i] = new Student(name, age);
        }
        //批量应用
        for (int i = 0; i < 20; i++) {
            System.out.print(stus[i].getName() + '\t');
            System.out.println(stus[i].getAge());
        }
//        B2ObjectArray.sortAge(stus,"换年龄"); //对象的属性变了
        B2ObjectArray.sortStu(stus,"换对象"); // 对象的属性没变！仍然排序

    }
    public static void sortAge(Student[] stus,String descript){
        System.out.println("==========="+descript+"===============");
        for(int i = 0; i<19;i++)
            for(int j = i;j<20;j++){
                if(stus[i].getAge() <= stus[j].getAge()){
                    int temp = stus[j].getAge();
                    stus[j].setAge(stus[i].getAge());
                    stus[i].setAge(temp);
                }
            }
        for(int i = 0;i<20;i++){
            System.out.print(stus[i].getName()+'\t');
            System.out.println(stus[i].getAge());
        }

    }
    public static void sortStu(Student[] stus,String descript){
        System.out.println("==========="+descript+"===============");
        for(int i = 0; i<19;i++)
            for(int j = i;j<20;j++){
                if(stus[i].getAge() <= stus[j].getAge()){
                    Student temp = stus[j];
                    stus[j]=stus[i];
                    stus[i]=temp;
                }
            }
        for(int i = 0;i<20;i++){
            System.out.print(stus[i].getName()+'\t');
            System.out.println(stus[i].getAge());
        }
    }
}
class Student{
    public Student(){} //空参构造器，不写也会自动添上。
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    private String name; // 这定义先后顺序似乎没要求！
    private int age;

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
