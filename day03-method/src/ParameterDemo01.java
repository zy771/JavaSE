/**
 * @Author：zz
 * @Package：PACKAGE_NAME
 * @Project：javase
 * @name：ParameterDemo01
 * @Date：2025/2/28 21:26
 */
public class ParameterDemo01 {
    public static void main(String[] args) {
        int[] arrs = new int[]{1, 2, 3, 4, 5};//new出来的放在堆空间
        change(arrs);//引用传递，传递的是地址，地址指向堆空间,还是值传递，但arrs中存的是数组地址
        //引用类型也是满足值传递，把地址值拷贝一份给形参，new出来的在堆空间中，指向同一个堆对象，所以arrs[1]修改了堆空间中的值
        System.out.println("main:" + arrs[1]);
    }
    public static void change(int[] arrs) {
        System.out.println("方法一" + arrs[1]);
        arrs[1] = 100;
        System.out.println("方法二" + arrs[1]);
    }
}
