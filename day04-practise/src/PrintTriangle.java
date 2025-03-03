/**
 * @Author：zz
 * @Package：PACKAGE_NAME
 * @Project：javase
 * @name：PrintTriangle
 * @Date：2025/3/2 18:29
 */
public class PrintTriangle {
    public static void main(String[] args) {

        /**
         * 打印三角形
         *     *
         *    ***
         *   *****
         *  ********
         *找规律
         * 行数     空格数     *数量
         * 1        3        1
         * 2        2        3
         * 3        1        5
         * 4        0        7
         * 空格数=n-行数
         * *数量=2*i-1，等差数列通项公式
         *
         */


        int n=4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
