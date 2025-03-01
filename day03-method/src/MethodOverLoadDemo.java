/**
 * @Author：zz
 * @Package：PACKAGE_NAME
 * @Project：javase
 * @name：MethodOverLoadDemo
 * @Date：2025/3/1 10:32
 */
public class MethodOverLoadDemo {
    public static void main(String[] args) {

    }


    //方法重载：同一个类中，方法名相同，参数列表不同，返回值类型可以相同也可以不同
    public static void fire(){
        System.out.println("发射子弹");
    }

    public static void fire(int num){
        System.out.println("发射" + num + "发子弹");
    }

    public static void fire(String name){
        System.out.println("发射" + name + "子弹");
    }
}
