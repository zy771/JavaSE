/**
 * @Author：zz
 * @Package：PACKAGE_NAME
 * @Project：javase
 * @name：PrintMultiplicationTable
 * @Date：2025/3/2 18:14
 */
public class PrintMultiplicationTable {
    public static void main(String[] args) {
        //计算机先打印行

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();//换行操作
        }
    }
}
