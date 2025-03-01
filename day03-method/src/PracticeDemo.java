/**
 * @Author：zz
 * @Package：PACKAGE_NAME
 * @Project：javase
 * @name：PracticeDemo
 * @Date：2025/2/28 17:59
 */

//Java方法被调用是在栈中执行的。main入栈 → 调用sum1ToN1时sum1ToN1入栈 →
// sum1ToN1执行完毕出栈 → 继续执行main中的其他方法调用 →
// 所有方法执行完后main出栈 → 程序结束
public class PracticeDemo {
    public static void main(String[] args) {
        System.out.println(sum1ToN1(100));

        System.out.println(sum1ToN2(100));

        System.out.println(isOddOrEven(1));

    }

    /*方法与方法不能嵌套*/
    //等差数列求和公式
    public static int sum1ToN1(int n){
        int sum=n*(n+1)/2;
        return sum;
    }

    //for循环求和
    public static int sum1ToN2(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    //判断一个数是奇数还是偶数
    public static String isOddOrEven(int n){
        if (n%2==0){
            return "偶数";
        }else {
            return "奇数";
        }
    }
}
