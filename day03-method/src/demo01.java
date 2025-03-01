/**
 * @Author：zz
 * @Package：PACKAGE_NAME
 * @Project：javase
 * @name：demo01
 * @Date：2025/2/28 17:29
 */
public class demo01 {
    public static void main(String[] args) {
        printHelloWorld();
        printHelloWorld(5);
    }

    //Java中同一个类中自己定义的方法一定与main方法并列
    //自己定义的方法名第一个首字母小写之后的每个单词的首字母都大写
    /*无返回值 无参数方法*/
    public static void printHelloWorld(){//没有返回值就用void
        for (int i=0;i<3;i++){
            System.out.println("hello world");
        }
    }

    public static void printHelloWorld(int n){
        for (int i=0;i<n;i++){
            System.out.println("hello world");
        }
    }
}
