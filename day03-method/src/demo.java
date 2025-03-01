/**
 * @Author：zz
 * @Package：PACKAGE_NAME
 * @Project：javase
 * @name：demo
 * @Date：2025/2/28 17:11
 */

/*B站 Java入门基础视频教程，java零基础自学就选黑马程序员
Java入门教程（含Java项目和Java真题）视频54-57(栈内存原理)-61*/


//public class demo {
//    public static void main(String[] args) {
//
////方法嵌套定义：Java不允许在main方法内部定义另一个方法sum，会导致编译错误
////方法结构混乱：sum方法应该作为类的成员方法与main方法并列定义，而不是嵌套在main内部
//        public static int sum(int a ,int b){
//            int c=a+b;
//            return c;
//        }
//    }
//}

public class demo {
    //方法嵌套定义：Java不允许在main方法内部定义另一个方法sum，会导致编译错误
    public static void main(String[] args) {
        int c = sum(10, 80);
        System.out.println(c);
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
        //System.out.println("hello");
        //return语句后面不能有代码
    }
}
