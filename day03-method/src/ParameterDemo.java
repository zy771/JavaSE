/**
 * @Author：zz
 * @Package：PACKAGE_NAME
 * @Project：javase
 * @name：ParameterDemo
 * @Date：2025/2/28 21:15
 */

//Java是值传递，改变形参的值，不会影响实参的值，传递的实参的副本。
public class ParameterDemo {
    public static void main(String[] args){
        int a = 10;//实参（值传递，传递的是10的拷贝）
        change(a);
        System.out.println("main:" + a);
    }

    public static void change(int a){//形参
        System.out.println("change1:" + a);
        a = 100;
        System.out.println("change2:" + a);
    }
}
