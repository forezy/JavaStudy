package a1prelude;

public class B3Operator {

//    System.out.println("");  框架，框架！
    public static void main(String args[]){
        /*
        算术运算符（共 7 个）：+ - * / % ++ --
         */
        // + 号：字符等效为 int类型的数；从左到右；字符串合并！
        System.out.println("a" + 10);  // a10
        System.out.println(10 + "a");  // 10a
        System.out.println('a' + 10);  // 107
        System.out.println(10 + 'a');  // 107
        System.out.println('a' + 10 + "a");  //107a

        // 除号 / ：有一个浮点，结果就浮点；都整形，自动取整
        System.out.println("=========除号研究========");
        System.out.println(5/2);  // 2
        System.out.println(5.0/2);  // 2.5
        System.out.println(5/2.0);  // 2.5
        System.out.println((5+0.0)/2);  // 2.5
        System.out.println(5/(2+0.0));  // 2.5

        // 取模 %：与被模的数符号相同，不是简单的取模！
        System.out.println("============取模运算=========");
        System.out.println(12%5);//2
        System.out.println((-12)%5);//-2
        System.out.println(-12%5);//-2
        System.out.println(12%-5);//2
        System.out.println(12%(-5));//2

        //三元运算符
        int max = 1 > 2 ? 2 : 1;
        System.out.println(max);



        //赋值运算符（6个）：= += -= *= /= %=
        int a = 1, b = 2; //连续赋值

        //比较运算符（6个）：== < > <= >= !=
//        System.out.println(1 === 2); 报错，没有===
        /*
        逻辑运算符，位运算符
         */
    }
}
